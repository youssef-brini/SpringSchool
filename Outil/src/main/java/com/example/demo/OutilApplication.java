package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entites.Outil;
import com.example.demo.service.IOutilService;

@SpringBootApplication
public class OutilApplication implements CommandLineRunner {
	@Autowired
	IOutilService iOutilService ;
	public static void main(String[] args)  {
		SpringApplication.run(OutilApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Outil o1 = new Outil(new Date(), "enis.tn-sfax");
		iOutilService.addOutil(o1);
		
	}

}
