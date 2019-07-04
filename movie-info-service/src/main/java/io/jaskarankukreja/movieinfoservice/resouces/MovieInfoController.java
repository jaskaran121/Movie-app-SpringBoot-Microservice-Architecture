package io.jaskarankukreja.movieinfoservice.resouces;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jaskarankukreja.movieinfoservice.models.MovieInfo;

@RestController
public class MovieInfoController{
	@Autowired
	private MovieInfoRepository movieInfoRepository;
	
	@PostMapping("/movieDescription")
	public String saveMovieDescription(@RequestBody MovieInfo movieInfo)
	{
		movieInfoRepository.save(movieInfo);
		return "Movie Description Saved";
		//return movieInfoResource.getAllMoviesInfo();
		//return Collections.singletonList(new MovieInfo(1,"A movie about a poor guy becoming succesfull"));
	}
	@GetMapping("/getMovies")
	public List<MovieInfo> getMovieDescription()
	{
		//movieInfoRepository.save(new MovieInfo(1,"Titanic","A story about sinking ship"));
		return (List<MovieInfo>) movieInfoRepository.findAll();
		//return movieInfoResource.getAllMoviesInfo();
		//return Collections.singletonList(new MovieInfo(1,"A movie about a poor guy becoming succesfull"));
	}
}
