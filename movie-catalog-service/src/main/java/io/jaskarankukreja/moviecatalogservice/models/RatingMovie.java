package io.jaskarankukreja.moviecatalogservice.models;

public class RatingMovie {

	private int userId;
	private int movieId;
	private int rating;
	RatingMovie(){
		
	}
	public RatingMovie(int movieId,int rating)
	{
		this.movieId = movieId;
		this.rating = rating;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}	
}
