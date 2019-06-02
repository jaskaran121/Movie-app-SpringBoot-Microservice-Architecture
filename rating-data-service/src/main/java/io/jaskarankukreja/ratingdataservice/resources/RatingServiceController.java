package io.jaskarankukreja.ratingdataservice.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.jaskarankukreja.ratingdataservice.models.RatingMovie;

@RestController
@RequestMapping("/rating")
public class RatingServiceController {
	@RequestMapping("/{UserId}")
	public List<RatingMovie> getMovieRatings(@PathVariable("UserId") int UserId)
	{
		return Arrays.asList(new RatingMovie(1,9),new RatingMovie(2,8));
	}
}