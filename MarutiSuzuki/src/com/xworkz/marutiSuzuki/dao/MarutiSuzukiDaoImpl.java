package com.xworkz.marutiSuzuki.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

//import com.xworkz.bollywood.entity.BollywoodEntity;
//import com.xworkz.bollywood.entity.BollywoodEntity;
//import com.xworkz.bollywood.entity.BollywoodEntity;
import com.xworkz.marutiSuzuki.entity.MarutiSuzukiEntity;

public class MarutiSuzukiDaoImpl implements  MarutiSuzukiDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz"); // this will only create the connecton
	// this is method to storing persistance class//detials in factory ref
	

	@Override
	public boolean save(MarutiSuzukiEntity marutiSuzukEntity) {
		// EntityManagerFactory
		// factory=Persistence.createEntityManagerFactory("com.xworkz");
		try {
            //returntype
			EntityManager manager = factory.createEntityManager(); // for doing curd operation., this connection for the database
			EntityTransaction tx = manager.getTransaction();//  for wrting into sql 
			tx.begin(); //to start the query
			manager.persist(marutiSuzukEntity);//insert into database
			tx.commit(); //save method push the connection
			manager.close();// connection
			//factory.close();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return true;

		// return false;
	}


	@Override
	public MarutiSuzukiEntity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			//BollywoodEntity entity = manager.find(BollywoodEntity.class, id);
			MarutiSuzukiEntity enity=manager.find(MarutiSuzukiEntity.class,id);
			if(enity!=null) {
				return enity;
			}
			
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {}
		
		return null;
	
	}


	@Override
	public MarutiSuzukiEntity updatecarNameById(String carName, Integer id) {
		EntityManager manager = factory.createEntityManager(); // for doing curd operation.and stabilish the connection
		EntityTransaction tx = manager.getTransaction();//  for wrting into sql 
		tx.begin();
	try {
		//BollywoodEntity entity=manager1.find(BollywoodEntity.class, id);
		MarutiSuzukiEntity entity=manager.find(MarutiSuzukiEntity.class ,id);
		entity.setCarName(carName);
		manager.merge(entity);
		tx.commit();
		
	}
	catch (PersistenceException e) {
		e.printStackTrace();
	}
	finally {
		manager.close();
	}
	return null;
	}

	@Override
	public void deleteById(Integer id) {
	//EntityManagerFactory	factory=Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager	manager=factory.createEntityManager();
    EntityTransaction tx=manager.getTransaction();
    tx.begin();
    try {
    	MarutiSuzukiEntity entity=manager.find(MarutiSuzukiEntity.class ,id);
    	manager.remove(entity);
		tx.commit();
	} catch (PersistenceException e) {
		e.printStackTrace();
	}finally {
		manager.close();
	}
	}

	//public boolean save(MarutiSuzukiEntity marutiSuzukEntity) 
		
		

}
