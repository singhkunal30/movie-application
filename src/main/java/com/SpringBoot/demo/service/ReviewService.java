package com.SpringBoot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.demo.repository.ReviewRepository;

@Service
public class ReviewService{
	
	@Autowired
	private ReviewRepository repository;
}
