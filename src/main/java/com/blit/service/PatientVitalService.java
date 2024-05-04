package com.blit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blit.PatientIntakeRepo;
import com.blit.Models.PatientsVitalsModel;

@Service
public class PatientVitalService {
	@Autowired
	private PatientIntakeRepo patientIntakeRepo;
	
	

	public List<PatientsVitalsModel> getAllPatientVitals() {
		
		return patientIntakeRepo.findAll();
	}

	public PatientsVitalsModel AddNewPatientVitals(PatientsVitalsModel patientsVitalsModel) {

		return patientIntakeRepo.save(patientsVitalsModel);
	}

}
