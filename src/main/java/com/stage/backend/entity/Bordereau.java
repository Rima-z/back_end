package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bordereau {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String reference;
	private String date;
	private Long nobrec;
	private Long numf;
	private Long montant;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getNobrec() {
		return nobrec;
	}
	public void setNobrec(Long nobrec) {
		this.nobrec = nobrec;
	}
	public Long getNumf() {
		return numf;
	}
	public void setNumf(Long numf) {
		this.numf = numf;
	}
	public Long getMontant() {
		return montant;
	}
	public void setMontant(Long montant) {
		this.montant = montant;
	}
	@Override
	public String toString() {
		return "Bordereau [id=" + id + ", reference=" + reference + ", date=" + date + ", nobrec=" + nobrec + ", numf="
				+ numf + ", montant=" + montant + "]";
	}
	

}
