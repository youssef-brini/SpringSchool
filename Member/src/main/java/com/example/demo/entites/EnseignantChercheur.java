package com.example.demo.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity @DiscriminatorValue("ens")
public class EnseignantChercheur extends Membre implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String grade,etablissement;

	public EnseignantChercheur() {
		super();
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public EnseignantChercheur(String nom, String prenom, String cin, String cv, String email, String password,
			Date date, String grade, String etablissement) {
		super(nom, prenom, cin, cv, email, password, date);
		this.grade = grade;
		this.etablissement = etablissement;
	}

	

}
