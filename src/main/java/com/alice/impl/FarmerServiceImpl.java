package com.alice.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alice.binding.Farmer;
import com.alice.repo.FarmerRepo;
import com.alice.service.FarmerService;

@Service
public class FarmerServiceImpl implements FarmerService {

	private final FarmerRepo farmerRepo;

	public FarmerServiceImpl(FarmerRepo farmerRepo) {
		this.farmerRepo = farmerRepo;
	}

	@Override
	public String upsertFarmerDetails(Farmer farmer) {
		Integer farmerId = farmer.getFarmerId();
		System.out.println(farmer);
		farmerRepo.save(farmer);
		System.out.println(farmer);

		if (farmerId == null) {
			return "record inserted..";

		} else {
			return "record updated";
		}		
	}

	@Override
	public List<Farmer> getAllFarmerDetails() {
		return farmerRepo.findAll();
	}

	@Override
	public String deleteFarmerById(Integer farmerId) {
		farmerRepo.deleteById(farmerId);
		return "Farmer details deleted..";
	}

}
