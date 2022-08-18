package com.xworkz.marutuSuzuki.runner;

import com.xworkz.marutiSuzuki.dao.MarutiSuzukiDao;
import com.xworkz.marutiSuzuki.dao.MarutiSuzukiDaoImpl;
//import com.xworkz.bollywood.Dao.BollywoodDao;
//import com.xworkz.bollywood.Dao.BollywoodDaoImpl;
import com.xworkz.marutiSuzuki.entity.MarutiSuzukiEntity;

public class MarutiSuzukiRunner {

	public static void main(String[] args) {
		MarutiSuzukiEntity marutiSuzukiEntity=new MarutiSuzukiEntity(3, "swift", "UP", "12pm", "2pm", "4am", "12/1/2022", "7/8/2022", "kavi", "30000");
		
		MarutiSuzukiDao marutiSuzukiDao= new MarutiSuzukiDaoImpl();
		
		marutiSuzukiDao.save(marutiSuzukiEntity);
		
		MarutiSuzukiEntity result	=marutiSuzukiDao.findById(1);

		System.out.println( result);
		MarutiSuzukiDao marutiSuzukiDao1= new MarutiSuzukiDaoImpl();
		MarutiSuzukiEntity res=marutiSuzukiDao1.updatecarNameById("Alto", 2);
		System.out.println(res);
		
		marutiSuzukiDao.deleteById(1);
	}

}
