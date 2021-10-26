package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MemberRepository;
import com.example.demo.entites.EnseignantChercheur;
import com.example.demo.entites.Etudiant;
import com.example.demo.entites.Membre;

@Service
public class MemberImpl implements IMemberService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EnseignantChercheurRepository ensignantRepository;
	@Override
	public Membre addMember(Membre m) {
		memberRepository.save(m);
		return m;
	}

	@Override
	public void deleteMember(Long id) {
		if(memberRepository.findById(id).isPresent())
			memberRepository.deleteById(id);
		else {
			System.err.println("ID NotFound");
		}
		
	}

	@Override
	public Membre updateMember(Membre p) {
		
		return memberRepository.saveAndFlush(p);
	}

	@Override
	public Membre findMember(Long id) {
		
		return memberRepository.findById(id).get();
	}

	@Override
	public List<Membre> findAll() {
		
		return memberRepository.findAll();
	}

	@Override
	public Membre findByCin(String cin) {
		Membre m= (Membre)memberRepository.findByCin(cin);
		return m;
	}

	@Override
	public Membre findByEmail(String email) {
		Membre m= (Membre)memberRepository.findByEmail(email);
		return m;
	}

	@Override
	public List<Membre> findByNom(String nom) {
		List<Membre> m= memberRepository.findByNom(nom);
		return m;
	}

	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		
		return etudiantRepository.findByDiplome(diplome);
	}

	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		
		return ensignantRepository.findByGrade(grade);
	}

	@Override
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
		
		return ensignantRepository.findByEtablissement(etablissement);
	}

	@Override
	public void affacterEtudiantToEnsignant(Long idEtudiant, Long idEnsignant) {
		Etudiant e =( etudiantRepository.findById((idEtudiant))).get();
		EnseignantChercheur ens = (ensignantRepository.findById(idEnsignant)).get();
		e.setEncadrant(ens);
		
	}
	
	

}
