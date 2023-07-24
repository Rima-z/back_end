package com.stage.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stage.backend.entity.Modifier;
import com.stage.backend.service.IModifierService;




@RestController
@RequestMapping("/Modifier")
@CrossOrigin(origins = "http://localhost:4200")
public class ModifierController {
	
private List<Modifier> modifierList = new ArrayList<>();
	
	@Autowired
	private IModifierService iModifierService;
	
	public void ModifierService() {
		 this.modifierList = new ArrayList<>();
	}
	
	@GetMapping("/liste")
    public List<Modifier> getAllModifier() {
        return iModifierService.getAllModifier();
    }
	
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addModifier(@RequestBody Modifier modifier) {
    iModifierService.addModifier(modifier);
    System.out.println("merci");
    }
	
}
