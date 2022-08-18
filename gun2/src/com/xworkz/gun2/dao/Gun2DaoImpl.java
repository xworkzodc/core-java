package com.xworkz.gun2.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

//import com.xworkz.gun.entity.GunEntity;
//import com.xworkz.gun.entity.GunEntity;
import com.xworkz.gun2.entity.Gun2Entity;

public class Gun2DaoImpl implements Gun2Dao{

	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(Gun2Entity gun2Entity) {
	EntityManager manager=	factory.createEntityManager();// database connection
	try {
	EntityTransaction tx=	manager.getTransaction(); //use to control source.
	tx.begin();
	manager.persist(gun2Entity);//to store data and refure for save
	tx.commit();
	manager.close();
	
	} catch (PersistenceException e) {
		e.printStackTrace();
	}
		return false;
	}

	@Override
	public Gun2Entity findById(Integer id) {
	EntityManager manager	=factory.createEntityManager();
	try {
	Gun2Entity entity=	manager.find(Gun2Entity.class, id);
	if (entity != null) {
		return entity;
	}
	} catch (PersistenceException e) {
		e.printStackTrace();
	}finally{
		manager.close();
	}
		return null;
	}

	@Override
	public void updategunNameById(String gunName, Integer id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		try {
			Gun2Entity entity=manager.find(Gun2Entity.class, id);
			entity.setGunName(gunName);
			manager.merge(entity);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		try {
			Gun2Entity entity=manager.find(Gun2Entity.class, id);
			manager.remove(entity);
			tx.commit();
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
	}

	

}
}
