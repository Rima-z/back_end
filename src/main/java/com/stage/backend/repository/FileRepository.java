package com.stage.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.stage.backend.entity.File;

public interface FileRepository  extends JpaRepository<File, Long>{

}
