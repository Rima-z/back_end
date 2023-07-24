package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stage.backend.entity.Modifier;
import com.stage.backend.repository.ModifierRepository;




@Service
public class ModifierService implements IModifierService {
	
	@Autowired
	private ModifierRepository modifierRepository;
	    private List<Modifier> modifierList;
	    
	    public ModifierService() {
	        this.modifierList = new ArrayList<>();
	    }
	    
	    @Override
	    @ResponseBody
	    public Modifier addModifier(@RequestBody Modifier modifier) {
	        return modifierRepository.save(modifier);
	    }
	    
	    @Override
	    public List<Modifier> getAllModifier() {
	        return modifierRepository.findAll();
	    }

	    @Override
	    public void deleteModifier(int modifierid) {
	        for (Modifier modifier : modifierList) {
	            if (modifier.getId() == modifierid) {
	            	modifierList.remove(modifier);
	                break;
	            }
	        }
	    }
	     
	   
	}

