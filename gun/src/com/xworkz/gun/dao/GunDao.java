package com.xworkz.gun.dao;

//import com.xworkz.bollywood.entity.BollywoodEntity;
import com.xworkz.gun.entity.GunEntity;

public interface GunDao {
boolean save(GunEntity gunEntity);
GunEntity findById(Integer id);
void updategunNameById(String gunName  ,Integer id);
void deleteById(Integer id);
}
