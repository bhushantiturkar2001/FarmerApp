package com.alice.binding;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Farmer Data")
public class Farmer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FARMER_ID")
	private Integer farmerId;
	
	@Column(name = "NAME")
	private String fname;
	
	@Column(name ="VILLAGE" )
	private String village;
	@Column(name = "CROP_NAME")
	private String cropName;
	
	@Column(name = "FARMING_AREA")
	private Float area;
		
}
