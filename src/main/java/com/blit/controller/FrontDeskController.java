package com.blit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blit.Models.FrontDeskPIntakes;
import com.blit.service.FrontDeskService;

@RestController
@RequestMapping("/frontdesk")
public class FrontDeskController {
	private FrontDeskService frontService;

	@Autowired
	public FrontDeskController(FrontDeskService frontService) {
		super();
		this.frontService = frontService;
	}
	@GetMapping
	public List<FrontDeskPIntakes> getAllPatients(){
		return frontService.getAllPatients();
		
	}

	@PostMapping
	public ResponseEntity AddNewPatient(@RequestBody FrontDeskPIntakes frontDeskIntakes) {
		frontDeskIntakes = frontService.addNewPatient(frontDeskIntakes);
		return ResponseEntity.status(201).body(frontDeskIntakes);
		
	}
	@DeleteMapping
	 public ResponseEntity DeletePatient(@RequestBody FrontDeskPIntakes frontDeskIntakes) {
		 frontDeskIntakes = frontService.deletePatient(frontDeskIntakes);
		 return ResponseEntity.status(201).body(frontDeskIntakes);
	 }
	
}


