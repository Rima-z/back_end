package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stage.backend.entity.Bordereau;
import com.stage.backend.repository.BordereauRepository;



@Service
public class BordereauService implements IBordereauService {
	
	@Autowired
	private BordereauRepository bordereauRepository;
	    private List<Bordereau> bordereauList;
	    
	    public BordereauService() {
	        this.bordereauList = new ArrayList<>();
	    }
	    
	    @Override
	    @ResponseBody
	    public Bordereau addBordereau(@RequestBody Bordereau bordereau) {
	        return bordereauRepository.save(bordereau);
	    }
	    
	    @Override
	    public List<Bordereau> getAllBordereau() {
	        return bordereauRepository.findAll();
	    }
	    
	    @Override
	    public void deleteBordereau(int bordereauid) {
	        for (Bordereau bordereau : bordereauList) {
	            if (bordereau.getId() == bordereauid) {
	            	bordereauList.remove(bordereau);
	                break;
	            }
	        }
	    }
}
