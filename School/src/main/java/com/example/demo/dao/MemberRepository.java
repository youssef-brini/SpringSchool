package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Membre;


public interface MemberRepository extends JpaRepository<Membre,Long>{
	Membre findByCin(String cin);
	List<Membre>findByNomStartingWith(String caractere);
	Membre findByEmail(String email);
}
