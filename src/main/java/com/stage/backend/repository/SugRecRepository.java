package com.stage.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.SugRec;

import java.util.Optional;

@Repository
public interface SugRecRepository extends JpaRepository<SugRec, Long> {
	Optional<SugRec> findById(Long id);

}
