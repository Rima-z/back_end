package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stage.backend.entity.Historiqued;
import com.stage.backend.repository.HistoriquedRepository;





@Service
public class HistoriquedService implements IHistoriquedService {
	
	
	@Autowired
	private HistoriquedRepository historiquedRepository;
	    private List<Historiqued> historiquedList;
	    
	    public HistoriquedService() {
	        this.historiquedList = new ArrayList<>();
	    }
	    
	    @Override
	    @ResponseBody
	    public Historiqued addHistoriqued(@RequestBody Historiqued historiqued) {
	        return historiquedRepository.save(historiqued);
	    }
	    
	    @Override
	    public List<Historiqued> getAllHistoriqued() {
	        return historiquedRepository.findAll();
	    }
	    
	    @Override
	    public void deleteHistoriqued(int historiquedid) {
	        for (Historiqued historiqued : historiquedList) {
	            if (historiqued.getId() == historiquedid) {
	            	historiquedList.remove(historiqued);
	                break;
	            }
	        }
	    }

}
