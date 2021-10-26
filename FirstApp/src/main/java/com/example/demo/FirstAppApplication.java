package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.HelloBean;
import com.example.demo.bean.IHello;

@SpringBootApplication
public class FirstAppApplication implements CommandLineRunner{
	@Autowired
	IHello arab;
	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(arab.getMessage(" From the other Side"));
		
	}

}
