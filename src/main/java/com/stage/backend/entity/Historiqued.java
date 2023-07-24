package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Historiqued {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private String contractant;
		private String matricule;
		private String adherent;
		private Long numd;
		private String date;
		private String detais;
		
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
		public Long getNumd() {
			return numd;
		}
		public void setNumd(Long numd) {
			this.numd = numd;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getDetais() {
			return detais;
		}
		public void setDetais(String detais) {
			this.detais = detais;
		}
		@Override
		public String toString() {
			return "Historiqued [id=" + id + ", contractant=" + contractant + ", matricule=" + matricule + ", adherent="
					+ adherent + ", numd=" + numd + ", date=" + date + ", detais=" + detais + "]";
		}
		

}
