package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Publication;
import com.example.demo.service.IPublicationService;

@SpringBootApplication
public class PublicationApplication implements CommandLineRunner {
	@Autowired
	IPublicationService iPublicationService;
	public static void main(String[] args) {
		SpringApplication.run(PublicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Publication p1 = new Publication(new Date(), "Articles ", "Spring Rest data", "https://spring.io/projects/spring-data-rest", "https://docs.spring.io/spring-data/rest/docs/2.6.x/reference/pdf/spring-data-rest-reference.pdf");
		iPublicationService.addPublication(p1);
	}

}
