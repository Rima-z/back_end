package com.stage.backend.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.stage.backend.entity.File;
import com.stage.backend.entity.SugRec;
import com.stage.backend.entity.Traitement;
import com.stage.backend.repository.FileRepository;
import com.stage.backend.service.ITraitementService;

import jakarta.websocket.server.PathParam;



@RestController
@RequestMapping("/Traitement")
@CrossOrigin(origins = "http://localhost:4200")
public class TraitementController {
	 @Autowired
	    private FileRepository fileRepository;

	private List<Traitement> traitementList = new ArrayList<>();
	
	@Autowired
	private ITraitementService iTraitementService;
	
	public void TraitementService() {
		 this.traitementList = new ArrayList<>();
	}
	
	@GetMapping("/listet")
    public List<Traitement> getAllTraitement() {
        return iTraitementService.getAllTraitement();
    }
	
	@PostMapping(value = "/addt",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addTraitement(@RequestBody Traitement traitement) {
    iTraitementService.addTraitement(traitement);
    System.out.println("merci");
    }
	
	@GetMapping(value="/validerTraitement")
	public void validerTraitement(@PathParam("traitmentId") Long traitmentId,@RequestParam("file") MultipartFile file) {
		
		//iTraitementService.validerTraitment(traitmentId);
		
		 if (!file.isEmpty()) {
             try {
                 String fileName = file.getOriginalFilename();
                 byte[] content = file.getBytes();

                 File fileEntity = new File();
                 fileEntity.setName(fileName);
                 fileEntity.setContent(content);

                 fileRepository.save(fileEntity);
                 iTraitementService.asssignNomFile(fileName, traitmentId);

                 // Redirect to a success page after successful upload
             } catch (IOException e) {
                 e.printStackTrace();
               
             }
         }

        
	}
	
}
