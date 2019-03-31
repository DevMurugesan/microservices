package com.movie.app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieService {

	@RequestMapping("/{movieId}")
	public Movie getMovies(@PathVariable("movieId") String movieId){
			return new Movie(2,"Movie2","English");
	}
}
