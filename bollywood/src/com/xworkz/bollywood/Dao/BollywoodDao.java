package com.xworkz.bollywood.Dao;

import com.xworkz.bollywood.entity.BollywoodEntity;

public interface BollywoodDao {
	boolean save(BollywoodEntity bollywoodEntity);
	BollywoodEntity findById(Integer id);
	void updateActorNameById(String actorName ,Integer id);
	void deleteById(Integer id);
	
	
}
