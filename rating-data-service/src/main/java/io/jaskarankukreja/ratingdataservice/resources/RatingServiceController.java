package io.jaskarankukreja.ratingdataservice.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.jaskarankukreja.ratingdataservice.models.RatingMovie;
import io.jaskarankukreja.ratingdataservice.models.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingServiceController {
	@RequestMapping("/{UserId}")
	public UserRating getMovieRatings(@PathVariable("UserId") int UserId)
	{
		List<RatingMovie> moviesRating = Arrays.asList(new RatingMovie(1,9),new RatingMovie(2,8));
		UserRating userRating = new UserRating();
		userRating.setMoviesRating(moviesRating);
		return userRating;
	}
}