package com.xworkz.mahindra.runner;

import com.xworkz.mahindra.dao.MahindraDao;
import com.xworkz.mahindra.dao.MahindraDaoImpl;
import com.xworkz.mahindra.entity.MahindraEntity;

public class MahindraRunner {

	public static void main(String[] args) {
		MahindraEntity mahindraEntity =new MahindraEntity(2, "belnovo", "mP", "12pm", "2pm", "4am",
				"12/1/2022", "7/8/2022", "kavita", "80000");
		MahindraDao mahindraDao=new MahindraDaoImpl();
		mahindraDao.save(mahindraEntity);
		
		mahindraDao.updatecarNameById("innovva", 3);
		MahindraEntity	res=mahindraDao.findById(3);
		System.out.println(res);
		
		
		mahindraDao.deleteById(2);
	}

}
