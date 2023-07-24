package com.stage.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PowerBIController {
	
	@GetMapping("/powerbi-ids")
	  public Map<String, String> getPowerBIIds() {
	    Map<String, String> ids = new HashMap<>();
	    ids.put("reportId", "8a75b175-585a-4933-8434-17f175b1d520/ReportSection1192e1f1a3772efc1707?experience=power-bi");
	    ids.put("groupId", "me");
	    return ids;
	  }

}
