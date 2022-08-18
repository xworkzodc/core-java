package com.xworkz.toyota.runner;

import com.xworkz.toyota.dao.ToyotaDao;
import com.xworkz.toyota.dao.ToyotaDaoImpl;
import com.xworkz.toyota.entity.ToyotaEntity;


public class ToyotaRunner {
	public static void main (String args [] ) {
	ToyotaEntity toyotaEntity=new ToyotaEntity(3, "ertiga", "mP", "12pm", "2pm", "4am",
			"12/1/2022", "7/8/2022", "kavita", "80000");
	
	ToyotaDao toyotaDao= new ToyotaDaoImpl();
	toyotaDao.save(toyotaEntity);
	
	ToyotaEntity res=toyotaDao.findById(2);
	System.out.println(res);
	
	toyotaDao.updatecarNameById("toyota", 2);
	
	toyotaDao.deleteById(1);
}
	
	
}
