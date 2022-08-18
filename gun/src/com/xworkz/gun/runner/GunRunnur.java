package com.xworkz.gun.runner;

import com.xworkz.gun.dao.GunDao;
import com.xworkz.gun.dao.GunDaoImpl;
import com.xworkz.gun.entity.GunEntity;

public class GunRunnur {

	public static void main(String[] args) {

		GunEntity gunEntity = new GunEntity(2, "Ak47", 22000, "Ramu", "Bandook");
		GunDao gunDao = new GunDaoImpl();
		// gunDao.save(gunEntity);
		//GunEntity res = gunDao.findById(1);
        //System.out.println(res);
		
		gunDao.updategunNameById("Rvalvar", 1);
		gunDao.deleteById(1);
	}

}
