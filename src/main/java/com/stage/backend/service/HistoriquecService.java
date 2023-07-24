package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stage.backend.entity.Historiquec;
import com.stage.backend.entity.Historiqued;
import com.stage.backend.repository.HistoriquecRepository;



@Service
public class HistoriquecService implements IHistoriquecService {
	
	
	@Autowired
	private HistoriquecRepository historiquecRepository;
	    private List<Historiquec> historiquecList;
	    
	    public HistoriquecService() {
	        this.historiquecList = new ArrayList<>();
	    }
	    
	    @Override
	    @ResponseBody
	    public Historiquec addHistoriquec(@RequestBody Historiquec historiquec) {
	        return historiquecRepository.save(historiquec);
	    }
	    
	    @Override
	    public List<Historiquec> getAllHistoriquec() {
	        return historiquecRepository.findAll();
	    }
	    
	    @Override
	    public void deleteHistoriquec(int historiquecid) {
	        for (Historiquec historiquec : historiquecList) {
	            if (historiquec.getId() == historiquecid) {
	            	historiquecList.remove(historiquec);
	                break;
	            }
	        }
	    }

}

