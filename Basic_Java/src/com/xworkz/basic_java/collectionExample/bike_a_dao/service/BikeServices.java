package com.xworkz.basic_java.collectionExample.bike_a_dao.service;

import com.xworkz.basic_java.collectionExample.bike_a_dao.dto.BikeDTO;

//import com.xworkz.basic_java.collectionExample.dto.BikeDTO;

public interface BikeServices {
	
	void addBike1(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);
	void addBike(BikeDTO hornett);

}
