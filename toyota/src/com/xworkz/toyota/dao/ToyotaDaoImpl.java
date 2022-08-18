package com.xworkz.toyota.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

//import com.xworkz.marutiSuzuki.entity.MarutiSuzukiEntity;
import com.xworkz.toyota.entity.ToyotaEntity;

public class ToyotaDaoImpl implements ToyotaDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz"); 
	@Override
	public boolean save(ToyotaEntity toyotaEntity) {
		try {
            //returntype
			EntityManager manager = factory.createEntityManager(); // for doing curd operation., this connection for the database
			EntityTransaction tx = manager.getTransaction();//  for wrting into sql 
			tx.begin(); //to start the query
			manager.persist(toyotaEntity);//insert into database
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
	public ToyotaEntity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			//BollywoodEntity entity = manager.find(BollywoodEntity.class, id);
			ToyotaEntity enity=manager.find(ToyotaEntity.class,id);
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
	public ToyotaEntity updatecarNameById(String carName, Integer id) {
		EntityManager manager = factory.createEntityManager(); // for doing curd operation.and stabilish the connection
		EntityTransaction tx = manager.getTransaction();//  for wrting into sql 
		tx.begin();
	try {
		//BollywoodEntity entity=manager1.find(BollywoodEntity.class, id);
		ToyotaEntity entity=manager.find(ToyotaEntity.class ,id);
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
	    	ToyotaEntity entity=manager.find(ToyotaEntity.class ,id);
	    	manager.remove(entity);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	}
	
