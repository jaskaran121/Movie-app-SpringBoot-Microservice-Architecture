package io.jaskarankukreja.moviecatalogservice.resources;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.jaskarankukreja.moviecatalogservice.models.CatalogItem;
import io.jaskarankukreja.moviecatalogservice.models.MovieInfo;
import io.jaskarankukreja.moviecatalogservice.models.RatingMovie;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private RestTemplate restTemplate;
	
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
    	ResponseEntity<List<RatingMovie>> response = restTemplate.exchange("http://localhost:8083/rating/"+ userId, HttpMethod.GET,null,
    			new ParameterizedTypeReference<List<RatingMovie>>() {});
    	List<RatingMovie> ratings = response.getBody();
    	return ratings.stream().map(rating -> {
    		MovieInfo movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), MovieInfo.class);
    		return new CatalogItem(movie.getName(),movie.getDescription(),rating.getRating());}).collect(Collectors.toList());
    	}
    }