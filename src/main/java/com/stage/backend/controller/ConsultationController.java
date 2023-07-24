package com.stage.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stage.backend.entity.Consultation;
import com.stage.backend.service.IConsultationService;



@RestController
@RequestMapping("/Consultation")
@CrossOrigin(origins = "http://localhost:4200")
public class ConsultationController {
private List<Consultation> consultationList = new ArrayList<>();
	
	@Autowired
	private IConsultationService iConsultationService;
	
	public void ConsultationService() {
		 this.consultationList = new ArrayList<>();
	}
	
	@GetMapping("/liste")
    public List<Consultation> getAllTraitement() {
        return iConsultationService.getAllConsultation();
    }
	
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addConsultation(@RequestBody Consultation consultation) {
    iConsultationService.addConsultation(consultation);
    System.out.println("merci");
    }

}
