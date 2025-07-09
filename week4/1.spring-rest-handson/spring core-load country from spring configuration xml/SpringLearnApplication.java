package com.cognizant.spring_learn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {
 private static final Logger logger=LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		logger.info("starting of main..");
		SpringApplication.run(SpringLearnApplication.class, args);
		displayCountry();
		logger.info("ending of main..");
	}
	public static void displayCountry() {
		logger.info("Inside displayCountry");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		logger.info("Country : {}", country.toString());

	}

}
