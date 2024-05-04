package com.blit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blit.Models.PatientsVitalsModel;

public interface PatientIntakeRepo extends JpaRepository<PatientsVitalsModel, Integer>{

	

}
