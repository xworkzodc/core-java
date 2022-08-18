package com.xworkz.gun3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.gun3.entity.Gun3Entity;

public class Gun3DaoImpl implements Gun3Dao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	@Override
	public boolean save(Gun3Entity gun3Entity) {
	
		try {
		EntityManager manager=	factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
        manager.persist(gun3Entity);
        tx.commit(); //save method
        
		manager.close();
		
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Gun3Entity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
		//BollywoodEntity entity = manager.find(BollywoodEntity.class, id);
			Gun3Entity entity=manager.find(Gun3Entity.class ,id);
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
			//BollywoodEntity entity=manager1.find(BollywoodEntity.class, id);
			Gun3Entity entity=manager.find(Gun3Entity.class ,id);
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
		EntityManager manager2 = factory.createEntityManager();
		EntityTransaction tx=manager2.getTransaction();
		tx.begin();
		try {
			Gun3Entity entity=manager2.find(Gun3Entity.class, id);
			manager2.remove(entity);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager2.close();
		}
		
	}

}
