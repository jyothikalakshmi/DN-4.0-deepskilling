package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@RestController
public class CountryController {
  
	@RequestMapping("/country")
	public Country getCountryIndia() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		return country;
	}
}
