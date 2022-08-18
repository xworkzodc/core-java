package com.xworkz.toyota.dao;

import com.xworkz.toyota.entity.ToyotaEntity;

public interface ToyotaDao {
	boolean save(ToyotaEntity toyotaEntity);
	ToyotaEntity findById(Integer id);
	ToyotaEntity updatecarNameById(String carName ,Integer id);
	void deleteById(Integer id);
}
