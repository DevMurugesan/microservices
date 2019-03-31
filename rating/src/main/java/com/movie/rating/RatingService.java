package com.movie.rating;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingService {
	
	
	@RequestMapping("/{reviewerId}")
	public Rating getRatings(@PathVariable("reviewerId") String reviewerId){
		
		//List<Rating> ratings = new ArrayList<Rating>();
		/*
		 * ratings.add(new Rating(1,"Person1","Nice",4)); ratings.add();
		 */
		return new Rating(2,"Person2","Nice",5);
	}
}
