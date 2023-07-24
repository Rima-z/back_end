package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Historiquec {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String transaction;
    private String bordereau;
	private String matricule;
	private String noma;
	private String nomb;
	private String medecin; 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	public String getBordereau() {
		return bordereau;
	}
	public void setBordereau(String bordereau) {
		this.bordereau = bordereau;
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
	@Override
	public String toString() {
		return "Historiquec [id=" + id + ", transaction=" + transaction + ", bordereau=" + bordereau + ", matricule="
				+ matricule + ", noma=" + noma + ", nomb=" + nomb + ", medecin=" + medecin + "]";
	}
	
	
    


	
	
	
	

}
