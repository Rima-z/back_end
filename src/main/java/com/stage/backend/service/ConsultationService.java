package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stage.backend.entity.Consultation;
import com.stage.backend.repository.ConsultationRepository;



@Service
public class ConsultationService implements IConsultationService {
	
	@Autowired
	private ConsultationRepository consultationRepository;
	    private List<Consultation> consultationList;
	    
	    public ConsultationService() {
	        this.consultationList = new ArrayList<>();
	    }
	    
	    @Override
	    @ResponseBody
	    public Consultation addConsultation(@RequestBody Consultation consultation) {
	        return consultationRepository.save(consultation);
	    }
	    
	    @Override
	    public List<Consultation> getAllConsultation() {
	        return consultationRepository.findAll();
	    }
	    
	    @Override
	    public void deleteConsultation(int consultationid) {
	        for (Consultation consultation : consultationList) {
	            if (consultation.getId() == consultationid) {
	            	consultationList.remove(consultation);
	                break;
	            }
	        }
	    }
	

}
