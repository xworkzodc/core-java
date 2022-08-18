package com.xworkz.gun2.dao;

import com.xworkz.gun2.entity.Gun2Entity;

//import com.xworkz.gun.entity.GunEntity;

public interface Gun2Dao {
	boolean save(Gun2Entity gun2Entity);
	Gun2Entity findById(Integer id);
	void updategunNameById(String gunName  ,Integer id);
	void deleteById(Integer id);
	}

