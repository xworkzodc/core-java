package com.xworkz.gun.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.transaction.Transaction;

//import com.xworkz.bollywood.entity.BollywoodEntity;
//import com.xworkz.bollywood.entity.BollywoodEntity;
import com.xworkz.gun.entity.GunEntity;

public class GunDaoImpl implements GunDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(GunEntity gunEntity) {
		try {
			EntityManager manager = factory.createEntityManager();//
		
			// creates a persistence unit by providing
			//the same unique name which we provide for persistence-unit in persistent. xml file. 
			EntityTransaction tx = manager.getTransaction();// use control resource
			
            tx.begin();
            manager.persist(gunEntity);//Hibernate persist is similar to save (with transaction) and 
           // it adds the entity object to the persistent context, 
            //so any further changes are tracked. If the object properties are changed before 
            //the transaction is committed or session is flushed, it will also be saved into database
            
            tx.commit(); //save method
        
			manager.close();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public GunEntity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
		//BollywoodEntity entity = manager.find(BollywoodEntity.class, id);
			GunEntity entity=manager.find(GunEntity.class ,id);
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
			GunEntity entity=manager.find(GunEntity.class ,id);
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
			GunEntity entity=manager2.find(GunEntity.class, id);
			manager2.remove(entity);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager2.close();
		}
		
	}

}
