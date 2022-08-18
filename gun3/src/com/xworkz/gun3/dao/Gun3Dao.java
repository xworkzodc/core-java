package com.xworkz.gun3.dao;

import com.xworkz.gun3.entity.Gun3Entity;

//import com.xworkz.gun.entity.GunEntity;

public interface Gun3Dao {
	boolean save(Gun3Entity gun3Entity);
	Gun3Entity findById(Integer id);
	void updategunNameById(String gunName  ,Integer id);
	void deleteById(Integer id);
}
