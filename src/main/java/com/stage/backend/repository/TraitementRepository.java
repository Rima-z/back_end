package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Traitement;

@Repository
public interface TraitementRepository extends JpaRepository<Traitement, Long> {
	Optional<Traitement> findById(Long id);

}
