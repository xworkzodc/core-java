package com.xworkz.runner;

import com.xworkz.bollywood.Dao.BollywoodDao;
import com.xworkz.bollywood.Dao.BollywoodDaoImpl;
import com.xworkz.bollywood.entity.BollywoodEntity;

public class BollywoodRunner {

	public static void main(String[] args) {
	/*	BollywoodEntity bollywoodEntity =new BollywoodEntity();
		bollywoodEntity.setId(1);
		bollywoodEntity.setActorName("nandan");
		bollywoodEntity.setLocation("btm");
		bollywoodEntity.setCheckInTime("12");
		bollywoodEntity.setCheckOut( " 1pm");
		bollywoodEntity.setCreateBy("darshan");
		bollywoodEntity.setCreateDate("12");
		bollywoodEntity.setUpdateDate("14");
		bollywoodEntity.setDriector("kavi");
		bollywoodEntity.setPricePerDay("10000");
		*/
		//BollywoodEntity bollywoodEntity =new BollywoodEntity(2, "Arjun", "UP", "12pm", "2pm", "4am", "12/1/2022", "7/8/2022", "kavi", "30000");
		
		
		BollywoodDao bollywoodDao= new BollywoodDaoImpl();
		//bollywoodDao.save(bollywoodEntity);
		
		//BollywoodEntity result	=bollywoodDao.findById(1);
       // System.out.println(result);
        bollywoodDao.updateActorNameById("Ravi", 1);
        bollywoodDao.deleteById(2);
        
}
}
