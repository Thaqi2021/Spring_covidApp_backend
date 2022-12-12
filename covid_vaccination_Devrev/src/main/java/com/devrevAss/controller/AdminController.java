package com.devrevAss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devrevAss.model.PatientEntry;
import com.devrevAss.model.VacCenters;
import com.devrevAss.service.PatEntryServiceImp;
import com.devrevAss.service.VacCenterServiceImp;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class AdminController {
	@Autowired
	PatEntryServiceImp patservice;
	
	@Autowired
	VacCenterServiceImp vacservice;
	
	@GetMapping("/vaccenter")
    public List<VacCenters> getAllCenter() {
        return (List<VacCenters>) vacservice.getAllCenter_detail();
    }
	
	@PostMapping("/addCenter")
    public ResponseEntity<?> NewCenter(@RequestBody VacCenters center) {
    	System.out.println("i m register in server");
    	String a=vacservice.saveCenterDetail(center);
    	System.out.println(a+"................");
    	if(a.equals(null)) {
    		return (ResponseEntity<?>) ResponseEntity.internalServerError();
    	}
    	else {
    		
    		return ResponseEntity.ok(center);
    	}
	}
	@PostMapping("/removeCenter")
    public ResponseEntity<?> removeCenter(@RequestBody int center_id) {
    	System.out.println("im deleting in vac center");
    	vacservice.delCenterDetail(center_id);
    	return ResponseEntity.ok("Done");
    	
	}
	
	
	
}
