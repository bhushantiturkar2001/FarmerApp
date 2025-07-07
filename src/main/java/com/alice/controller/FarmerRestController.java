package com.alice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alice.binding.Farmer;
import com.alice.service.FarmerService;

@RestController
public class FarmerRestController {

	@Autowired
	private FarmerService service;

	@PostMapping("/farmer")
	public ResponseEntity<String> addFarmerDetails(@RequestBody Farmer farmer) {

		String upsertFarmerDetails = service.upsertFarmerDetails(farmer);
		return new ResponseEntity<String>(upsertFarmerDetails, HttpStatus.CREATED);

	}

	@GetMapping("/farmers")
	public ResponseEntity<List<Farmer>> getAllFarmerList() {
		List<Farmer> allFarmerDetails = service.getAllFarmerDetails();
		return new ResponseEntity<>(allFarmerDetails, HttpStatus.OK);

	}

	@PutMapping("/farmer")
	public ResponseEntity<String> updateFarmerDetails(@RequestBody Farmer farmer){
		String upsertFarmerDetails = service.upsertFarmerDetails(farmer);
		return new ResponseEntity<String>(upsertFarmerDetails,HttpStatus.OK);
	}

	@DeleteMapping("/book/{farmerId}")
	public ResponseEntity<String> deleteFarmerDetails(@PathVariable Integer farmerId) {
		String deleteFarmerById = service.deleteFarmerById(farmerId);
		return new ResponseEntity<String>(deleteFarmerById, HttpStatus.OK);
	}

}
