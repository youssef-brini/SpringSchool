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
import com.example.demo.service.IMemberService;

@SpringBootApplication
public class MemberApplication implements CommandLineRunner{
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	IMemberService iMemberService;
	public static void main(String[] args) {
		SpringApplication.run(MemberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		EnseignantChercheur ens1 = new EnseignantChercheur("frikha","tarak","13456789","","affef.mdhafar@enis.tn","0000",new Date(),"","");
		memberRepository.save(ens1);
		Membre etd1 = new Etudiant("brini", "youssef", "11113710", "en cours ...", "youssef.brini@enis.tn", "26262011", new Date(), new Date(), "Eleve ingeneur", ens1);
		memberRepository.save(etd1);
		
		
	}

}
