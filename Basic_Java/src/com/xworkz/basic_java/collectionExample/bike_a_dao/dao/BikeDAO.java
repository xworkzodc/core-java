package com.xworkz.basic_java.collectionExample.bike_a_dao.dao;

import com.xworkz.basic_java.collectionExample.bike_a_dao.dto.BikeDTO;

public interface BikeDAO {

	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);
}
