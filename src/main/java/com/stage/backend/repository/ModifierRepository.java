package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Modifier;


@Repository
public interface ModifierRepository extends JpaRepository<Modifier, Long> {
	Optional<Modifier> findById(Long id);

}