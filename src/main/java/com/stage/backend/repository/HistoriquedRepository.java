package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Historiqued;

@Repository
public interface HistoriquedRepository  extends JpaRepository<Historiqued, Long> {
	Optional<Historiqued> findById(Long id);

}
