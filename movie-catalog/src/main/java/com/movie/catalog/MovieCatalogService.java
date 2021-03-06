package com.movie.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/moviecat")
public class MovieCatalogService {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public CatalogItem getCatalog(@PathVariable("userId") String userId) {
		
		Movie movie =  restTemplate.getForObject( "http://movie-service/movie/3", Movie.class);
		Rating rating = restTemplate.getForObject( "http://rating-service/rating/7", Rating.class);
		
		 CatalogItem cat= new CatalogItem(userId, movie, rating);
		
		
		return cat;
	}
}
