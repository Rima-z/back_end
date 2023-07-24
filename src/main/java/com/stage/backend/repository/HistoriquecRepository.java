package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Historiquec;

@Repository
public interface HistoriquecRepository extends JpaRepository<Historiquec, Long> {
	Optional<Historiquec> findById(Long id);

}

