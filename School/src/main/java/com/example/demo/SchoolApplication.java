package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.MemberRepository;
import com.example.demo.entites.EnseignantChercheur;
import com.example.demo.entites.Etudiant;
import com.example.demo.entites.Membre;

@SpringBootApplication
public class SchoolApplication implements CommandLineRunner{
	@Autowired
	MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		EnseignantChercheur ens1 = new EnseignantChercheur("mthafar","affef","13456789","","affef.mdhafar@enis.tn","0000",new Date(),"","");
		Membre etd1 = new Etudiant("brini", "youssef", "11113710", "en cours ...", "youssef.brini@enis.tn", "26262011", new Date(), new Date(), "Eleve ingeneur", ens1);
		memberRepository.save(etd1);
	}

}
