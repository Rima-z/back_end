package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Traitement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String contractant;
	private String matricule;
    private String adherent;
    private Long num;
    private String dater;
    private String statut;
    private String détail;
    private String action;
    private Boolean estTraite=false;
    private String nomFile;
    
    
   
	public String getNomFile() {
		return nomFile;
	}
	public void setNomFile(String nomFile) {
		this.nomFile = nomFile;
	}
	public Boolean getEstTraite() {
		return estTraite;
	}
	public void setEstTraite(Boolean estTraite) {
		this.estTraite = estTraite;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContractant() {
		return contractant;
	}
	public void setContractant(String contractant) {
		this.contractant = contractant;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getAdherent() {
		return adherent;
	}
	public void setAdherent(String adherent) {
		this.adherent = adherent;
	}
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getDater() {
		return dater;
	}
	public void setDater(String dater) {
		this.dater = dater;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getDétail() {
		return détail;
	}
	public void setDétail(String détail) {
		this.détail = détail;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Traitement [id=" + id + ", contractant=" + contractant + ", matricule=" + matricule + ", adherent="
				+ adherent + ", num=" + num + ", dater=" + dater + ", statut=" + statut + ", détail=" + détail
				+ ", action=" + action + "]";
	}



}
