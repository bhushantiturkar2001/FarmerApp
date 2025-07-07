package com.alice.service;


import com.alice.binding.Farmer;

public interface FarmerService {
	
	public String upsertFarmerDetails(Farmer farmer);
	
	public java.util.List<Farmer> getAllFarmerDetails();
	
	public String deleteFarmerById(Integer farmerId);
	
	
	

}
