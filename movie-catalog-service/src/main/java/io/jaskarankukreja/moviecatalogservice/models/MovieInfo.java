package io.jaskarankukreja.moviecatalogservice.models;

public class MovieInfo {
 private int movieId;
 private String name;
 
 public MovieInfo()
 {
	 
 }
 public MovieInfo(int movieId,String description,String name){
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
private String description;
 

}
