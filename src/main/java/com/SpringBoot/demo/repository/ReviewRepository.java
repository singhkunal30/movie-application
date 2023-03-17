package com.SpringBoot.demo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.demo.model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
