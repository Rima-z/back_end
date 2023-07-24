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

import com.stage.backend.entity.Historiqued;
import com.stage.backend.service.IHistoriquedService;



@RestController
@RequestMapping("/Historiqued")
@CrossOrigin(origins = "http://localhost:4200")
public class HistoriquedController {
private List<Historiqued> historiquedList = new ArrayList<>();
	
	@Autowired
	private IHistoriquedService iHistoriquedService;
	
	public void HistoriquedService() {
		 this.historiquedList = new ArrayList<>();
	}
	
	@GetMapping("/listeh")
    public List<Historiqued> getAllHistoriqued() {
        return iHistoriquedService.getAllHistoriqued();
    }
	
	@PostMapping(value = "/addh",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addHistoriqued(@RequestBody Historiqued historiqued) {
    iHistoriquedService.addHistoriqued(historiqued);
    System.out.println("merci");
    }

}
