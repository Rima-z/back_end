package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Consultation;



@Repository
public interface ConsultationRepository  extends JpaRepository<Consultation, Long> {
	Optional<Consultation> findById(Long id);

}
