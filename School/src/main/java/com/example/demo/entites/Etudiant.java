package com.example.demo.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity @DiscriminatorValue("etd")
public class Etudiant extends Membre implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date dateInscription;
	private String diplome;
	@ManyToOne
	private EnseignantChercheur encadrant;
	public Etudiant() {
		super();
	}
	public Etudiant(String nom,String prenom,String cin,String cv ,String email,String password,Date date,Date dateInscription, String diplome, EnseignantChercheur encadrant) {
		super();
		this.dateInscription = dateInscription;
		this.diplome = diplome;
		this.encadrant = encadrant;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	

}
