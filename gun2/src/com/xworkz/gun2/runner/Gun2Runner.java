package com.xworkz.gun2.runner;

import com.xworkz.gun2.dao.Gun2Dao;
import com.xworkz.gun2.dao.Gun2DaoImpl;
import com.xworkz.gun2.entity.Gun2Entity;

public class Gun2Runner {

	public static void main(String[] args) {
	Gun2Entity gun2Entity=new Gun2Entity(2, "rivalvar", 22000, "Raheem", "Bandook","black");
    Gun2Dao gun2Dao=new Gun2DaoImpl();
 //   gun2Dao.save(gun2Entity);
    
   // Gun2Entity res=gun2Dao.findById(1);
    System.out.println("res");
    //gun2Dao.updategunNameById("katta", 1);
    //gun2Dao.deleteById(1);
	}

}
