package io.jaskarankukreja.ratingdataservice.models;

import java.util.ArrayList;
import java.util.List;

public class UserRating {

	List<RatingMovie> moviesRating;
	
	public UserRating()
	{
		moviesRating = new ArrayList<>();
	}
	
	public List<RatingMovie> getMoviesRating() {
		return moviesRating;
	}
	public void setMoviesRating(List<RatingMovie> moviesRating) {
		this.moviesRating = moviesRating;
	}
}
