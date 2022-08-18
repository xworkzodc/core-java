package com.xworkz.freedomFighters.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomFighters.dao.FreedomDao;
import com.xworkz.freedomFighters.dao.FreedomDaoImpl;
import com.xworkz.freedomFighters.entity.FreedomEntity;

public class FreedomRunner {

	public static void main(String[] args) {
		FreedomEntity entity = new FreedomEntity(1, "Bose", LocalDateTime.now(), LocalDateTime.now(), "male",
				"bangalore", "arjun", LocalDate.now(), "manoj", LocalDate.now());
		
		FreedomEntity entity1 = new FreedomEntity(2, "Bose", LocalDateTime.now(), LocalDateTime.now(), "male",
				"bangalore", "arjun", LocalDate.now(), "manoj", LocalDate.now());
		
		FreedomDao dao=new FreedomDaoImpl();
		List<FreedomEntity> entities=new ArrayList();
		entities.add(entity);
		entities.add(entity1);
		dao.addAll(entities);	
		}

}
