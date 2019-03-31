package com.movie.catalog;

public class Rating {
	

	private int ratingId;
	private String reviewerName;
	private String comments;
	private int ratings;
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(int ratingId, String reviewerName, String comments, int ratings) {
		super();
		this.ratingId = ratingId;
		this.reviewerName = reviewerName;
		this.comments = comments;
		this.ratings = ratings;
	}
	/**
	 * @return the ratingId
	 */
	public int getRatingId() {
		return ratingId;
	}
	/**
	 * @param ratingId the ratingId to set
	 */
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	/**
	 * @return the reviewerName
	 */
	public String getReviewerName() {
		return reviewerName;
	}
	/**
	 * @param reviewerName the reviewerName to set
	 */
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the ratings
	 */
	public int getRatings() {
		return ratings;
	}
	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
}
