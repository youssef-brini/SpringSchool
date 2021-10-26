package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entites.Evenement;
import com.example.demo.service.IEvenementService;

@SpringBootApplication
public class EvenementApplication implements CommandLineRunner {
	@Autowired
	IEvenementService iEvenementService;
	public static void main(String[] args) {
		SpringApplication.run(EvenementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Evenement e1 = new Evenement(new Date(), "alflila w lila", "pitch");
		iEvenementService.addEvenement(e1);
		
	}

}
