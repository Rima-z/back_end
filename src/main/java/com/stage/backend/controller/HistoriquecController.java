package com.stage.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stage.backend.entity.Historiquec;
import com.stage.backend.service.IHistoriquecService;



@RestController
@RequestMapping("/Historiquec")
@CrossOrigin(origins = "http://localhost:4200")
public class HistoriquecController {
private List<Historiquec> historiquecList = new ArrayList<>();
	
	@Autowired
	private IHistoriquecService iHistoriquecService;
	
	public void HistoriquecService() {
		 this.historiquecList = new ArrayList<>();
	}
	
	@GetMapping("/listec")
    public List<Historiquec> getAllHistoriquec() {
        return iHistoriquecService.getAllHistoriquec();
    }
	
	@PostMapping(value = "/addc",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addHistoriquec(@RequestBody Historiquec historiquec) {
    iHistoriquecService.addHistoriquec(historiquec);
    System.out.println("merci");
    }


}
