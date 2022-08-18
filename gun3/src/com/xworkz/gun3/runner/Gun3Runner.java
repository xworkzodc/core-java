package com.xworkz.gun3.runner;

import com.xworkz.gun3.dao.Gun3Dao;
import com.xworkz.gun3.dao.Gun3DaoImpl;
import com.xworkz.gun3.entity.Gun3Entity;

public class Gun3Runner {

	public static void main(String[] args) {
		Gun3Entity gun3Entity=new Gun3Entity(1, "rivalvar", 22000, "Raheem", "Bandook","black");
		Gun3Dao gun3Dao=new Gun3DaoImpl();
		gun3Dao.save(gun3Entity);
		
	    Gun3Entity res=gun3Dao.findById(1);
	    System.out.println("res");
	   // gun3Dao.updategunNameById("katta", 1);
	   // gun3Dao.deleteById(1);
	}

}
