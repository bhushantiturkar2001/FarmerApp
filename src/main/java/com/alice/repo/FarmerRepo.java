package com.alice.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alice.binding.Farmer;

public interface FarmerRepo extends JpaRepository<Farmer, Serializable> {

}
