package com.example.mytineraryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mytineraryapp.model.City;


@Repository
public interface CityRepository <T> extends JpaRepository<City, Long> {
	
	

}


 