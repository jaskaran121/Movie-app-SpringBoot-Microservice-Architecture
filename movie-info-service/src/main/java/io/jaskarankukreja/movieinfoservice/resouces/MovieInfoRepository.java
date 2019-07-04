package io.jaskarankukreja.movieinfoservice.resouces;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import io.jaskarankukreja.movieinfoservice.models.MovieInfo;

public interface MovieInfoRepository extends CrudRepository<MovieInfo,Integer>{
	
	@SuppressWarnings("unchecked")
	MovieInfo save(MovieInfo movieInfo);
	
	List<MovieInfo> findAll();
}
