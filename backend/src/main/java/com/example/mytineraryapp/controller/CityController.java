package com.example.mytineraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.mytineraryapp.model.City;
import com.example.mytineraryapp.repository.CityRepository;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CityController {
	
	@Autowired
	private CityRepository <?> cityRepository;
	
	//get all cities
	
	@GetMapping("/cities/all")
	public List<City> getAllCities(){
		return cityRepository.findAll();
	}
	
	//create city
	@PostMapping("cities/add")
	public City addCity(@RequestBody City city) {
		return cityRepository.save(city);
		
	}
}
  