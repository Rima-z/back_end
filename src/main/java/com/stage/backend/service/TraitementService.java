package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stage.backend.entity.Traitement;
import com.stage.backend.repository.TraitementRepository;



@Service
public class TraitementService implements ITraitementService {
	
	@Autowired
	private TraitementRepository traitementRepository;
	    private List<Traitement> traitementList;
	    
	    public TraitementService() {
	        this.traitementList = new ArrayList<>();
	    }
	    
	    @Override
	    @ResponseBody
	    public Traitement addTraitement(@RequestBody Traitement traitement) {
	        return traitementRepository.save(traitement);
	    }
	    
	    @Override
	    public List<Traitement> getAllTraitement() {
	        return traitementRepository.findAll();
	    }
	    
	    @Override
	    public void deleteTraitement(int traitementid) {
	        for (Traitement traitement : traitementList) {
	            if (traitement.getId() == traitementid) {
	                traitementList.remove(traitement);
	                break;
	            }
	        }
	    }

		@Override
		public void validerTraitment(Long traitementId) {
			Traitement traitment = new Traitement();
			traitment= traitementRepository.findById(traitementId).orElse(null);
			
			traitment.setEstTraite(true);
			
			traitementRepository.deleteById(traitementId);
			
		}

		@Override
		public void asssignNomFile(String nomFile,Long id) {
			Traitement traitment = new Traitement();
			traitment= traitementRepository.findById(id).orElse(null);
			traitment.setNomFile(nomFile);
			traitementRepository.save(traitment);
		}


}
