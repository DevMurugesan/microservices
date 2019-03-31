package com.movie.catalog;

public class CatalogItem {
	private String userId;
	private Movie movie;
	private Rating rating;
	
	
	
	public CatalogItem(String userId, Movie movie, Rating rating) {
		super();
		this.userId = userId;
		this.movie = movie;
		this.rating = rating;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	
	
}
