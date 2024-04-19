package com.blit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blit.FrontDeskRepo;
import com.blit.Models.FrontDeskPIntakes;

@Service
public class FrontDeskService {
	
	@Autowired
	private FrontDeskRepo frontDeskRepo;

	public List<FrontDeskPIntakes> getAllPatients() {
		return frontDeskRepo.findAll();
	}
	public FrontDeskPIntakes addNewPatient(FrontDeskPIntakes frontDeskPIntakes) {
		return frontDeskRepo.save(frontDeskPIntakes);
	}
				

}
