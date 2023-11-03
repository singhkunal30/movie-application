package com.SpringBoot.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.models.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
