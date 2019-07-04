package io.jaskarankukreja.movieinfoservice.models;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity(name="MOVIE_DB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieInfo {

 @Id
 private int movieId;
 private String description;
 private String name;
 //static List<MovieInfo> myList = Arrays.asList(new MovieInfo(1,"Titanic","A story about sinking ship"),new MovieInfo(2,"Rudy","Football player story"));
 public MovieInfo()
 {
	 
 }
 public MovieInfo(int movieId,String name,String description){
	 this.movieId = movieId;
	 this.description = description;
	 this.name = name;
}
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

//public static MovieInfo getMovieInfo(int movieId)
//{
//	for(MovieInfo movie:myList) {
//		if(movie.getMovieId() == movieId)
//		{
//			return movie;
//		}
//	}
//	return null;
//}
}
