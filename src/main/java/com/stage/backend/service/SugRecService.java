package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stage.backend.entity.SugRec;
import com.stage.backend.repository.SugRecRepository;

@Service
public class SugRecService implements ISugRecService {

@Autowired
private SugRecRepository sugRecRepository;
    private List<SugRec> sugRecList;

    public SugRecService() {
        this.sugRecList = new ArrayList<>();
    }

    @Override
    @ResponseBody
    public SugRec addSugRec(@RequestBody SugRec sugRec) {
        return sugRecRepository.save(sugRec);
    }

    @Override
    public List<SugRec> getAllSugRec() {
        return sugRecRepository.findAll();
    }

    
    @Override
    public void deleteSugRec(Long sugRecnRec) {
       
    Optional<SugRec> sugRec =sugRecRepository.findById(sugRecnRec);
    if(sugRec!=null) {
        sugRecRepository.deleteById(sugRecnRec);
    }
   
   
    }
   
    // creaction méthode de recherche
   
    
   
}