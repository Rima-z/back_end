package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.Consultation;



public interface IConsultationService {
	Consultation addConsultation(Consultation consultation);
    List<Consultation> getAllConsultation();
    void deleteConsultation(int consultationId);

}
