package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Modifier {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomprenomm;
    private String matriculem;
    private String emailm;
    private Long telm;
    private Long portablem;
    private String adressem;
    private Long idbm;
    private String idcm;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomprenomm() {
		return nomprenomm;
	}
	public void setNomprenomm(String nomprenomm) {
		this.nomprenomm = nomprenomm;
	}
	public String getMatriculem() {
		return matriculem;
	}
	public void setMatriculem(String matriculem) {
		this.matriculem = matriculem;
	}
	public String getEmailm() {
		return emailm;
	}
	public void setEmailm(String emailm) {
		this.emailm = emailm;
	}
	public Long getTelm() {
		return telm;
	}
	public void setTelm(Long telm) {
		this.telm = telm;
	}
	public Long getPortablem() {
		return portablem;
	}
	public void setPortablem(Long portablem) {
		this.portablem = portablem;
	}
	public String getAdressem() {
		return adressem;
	}
	public void setAdressem(String adressem) {
		this.adressem = adressem;
	}
	public Long getIdbm() {
		return idbm;
	}
	public void setIdbm(Long idbm) {
		this.idbm = idbm;
	}
	public String getIdcm() {
		return idcm;
	}
	public void setIdcm(String idcm) {
		this.idcm = idcm;
	}
	@Override
	public String toString() {
		return "Modifier [id=" + id + ", nomprenomm=" + nomprenomm + ", matriculem=" + matriculem + ", emailm=" + emailm
				+ ", telm=" + telm + ", portablem=" + portablem + ", adressem=" + adressem + ", idbm=" + idbm
				+ ", idcm=" + idcm + "]";
	}
    

	

}
