package com.SpringBoot.demo.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.demo.model.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
	Optional<Movie> findMovieByImdbId(String imdbId);
}
