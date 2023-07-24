package com.stage.backend.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.stage.backend.entity.File;
import com.stage.backend.repository.FileRepository;


@RestController
@RequestMapping("/Uploader")
public class Uploader {
	  @Autowired
	    private FileRepository fileRepository;

	    @PostMapping("/upload")
	    public String uploadFile(@RequestParam("file") MultipartFile file) {
	      

	    	 if (!file.isEmpty()) {
	             try {
	                 String fileName = file.getOriginalFilename();
	                 byte[] content = file.getBytes();

	                 File fileEntity = new File();
	                 fileEntity.setName(fileName);
	                 fileEntity.setContent(content);

	                 fileRepository.save(fileEntity);

	                 return "redirect:/success"; // Redirect to a success page after successful upload
	             } catch (IOException e) {
	                 e.printStackTrace();
	                 return "redirect:/error"; // Redirect to an error page in case of upload failure
	             }
	         }

	         return "redirect:/error"; 
	    }
}
