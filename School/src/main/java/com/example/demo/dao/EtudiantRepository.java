package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,
Long>{
	List<Etudiant>findByDiplome(String diplome);
	List<Etudiant>findByDiplomeOrderByDateInscriptionDesc(String
	diplome);

}
