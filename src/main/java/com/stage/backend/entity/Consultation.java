package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consultation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Long numt;
	private String matricule;
	private String noma;
	private String nomb;
	private String medecin;
	private Long numc;
	private String date;
	private Long montant;
	private Long reste;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumt() {
		return numt;
	}
	public void setNumt(Long numt) {
		this.numt = numt;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNoma() {
		return noma;
	}
	public void setNoma(String noma) {
		this.noma = noma;
	}
	public String getNomb() {
		return nomb;
	}
	public void setNomb(String nomb) {
		this.nomb = nomb;
	}
	public String getMedecin() {
		return medecin;
	}
	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}
	public Long getNumc() {
		return numc;
	}
	public void setNumc(Long numc) {
		this.numc = numc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getMontant() {
		return montant;
	}
	public void setMontant(Long montant) {
		this.montant = montant;
	}
	public Long getReste() {
		return reste;
	}
	public void setReste(Long reste) {
		this.reste = reste;
	}
	@Override
	public String toString() {
		return "Consultation [id=" + id + ", numt=" + numt + ", matricule=" + matricule + ", noma=" + noma + ", nomb="
				+ nomb + ", medecin=" + medecin + ", numc=" + numc + ", date=" + date + ", montant=" + montant
				+ ", reste=" + reste + "]";
	}
	

}
