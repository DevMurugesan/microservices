package com.movie.app;

public class Movie {
	private int movieId;
	private String name;
	private String language;
	
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Movie(int movieId, String name, String language) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.language = language;
	}
	/**
	 * @return the movieId
	 */
	public int getMovieId() {
		return movieId;
	}
	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
