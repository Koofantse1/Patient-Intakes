package com.blit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blit.Models.PatientsVitalsModel;
import com.blit.service.PatientVitalService;

@RestController
@RequestMapping("/patientVitals")
public class PatientVitalController {
	
	private PatientVitalService patientVitalService;
	
	@Autowired
	public PatientVitalController(PatientVitalService patientVitalService) {
		super();
		this.patientVitalService = patientVitalService;
	}
	@GetMapping
	public List<PatientsVitalsModel> getAllPatientVitals (){
		return patientVitalService.getAllPatientVitals();
	}
	
	@PostMapping
	public ResponseEntity AddNewPatienrVitals(@RequestBody PatientsVitalsModel patientVitalsModel) {
		patientVitalsModel = patientVitalService.AddNewPatientVitals(patientVitalsModel);
		return ResponseEntity.status(201).body(patientVitalsModel);
		
	}
		
}
