package com.xworkz.marutiSuzuki.dao;

//import com.xworkz.bollywood.entity.BollywoodEntity;
import com.xworkz.marutiSuzuki.entity.MarutiSuzukiEntity;

public interface MarutiSuzukiDao {
	boolean save(MarutiSuzukiEntity marutiSuzukiEntity);
    MarutiSuzukiEntity findById(Integer id);
	MarutiSuzukiEntity updatecarNameById(String carName ,Integer id);
	void deleteById(Integer id);
}
