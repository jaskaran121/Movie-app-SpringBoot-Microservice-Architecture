package io.jaskarankukreja.movieinfoservice.resouces;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jaskarankukreja.movieinfoservice.models.MovieInfo;

@RestController
@RequestMapping("/movies")
public class MovieInfoController{

	@RequestMapping("/{movieId}")
	public MovieInfo getMovieDescription(@PathVariable("movieId") int movieId)
	{
		MovieInfo movie = MovieInfo.getMovieInfo(movieId);
		return movie;
		//return Collections.singletonList(new MovieInfo(1,"A movie about a poor guy becoming succesfull"));
	}
}
