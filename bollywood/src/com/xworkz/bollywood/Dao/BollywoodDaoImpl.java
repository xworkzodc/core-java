package com.xworkz.bollywood.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.bollywood.entity.BollywoodEntity;


// fresher or exp
public class BollywoodDaoImpl implements BollywoodDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz"); 
	// this is method to storing persistance class//detials in factory ref
	

	@Override
	public boolean save(BollywoodEntity bollywoodEntity) {
		// EntityManagerFactory
		// factory=Persistence.createEntityManagerFactory("com.xworkz");
		try {

			EntityManager manager = factory.createEntityManager(); // for doing curd operation.
			EntityTransaction tx = manager.getTransaction();//  for wrting into sql 
			tx.begin(); //to start the query
			manager.persist(bollywoodEntity);//
			tx.commit(); //save method
			manager.close();
			//factory.close();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return true;

		// return false;
	}

	@Override
	public BollywoodEntity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
		BollywoodEntity entity = manager.find(BollywoodEntity.class, id);
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
	public void updateActorNameById(String actorName, Integer id) {
		EntityManager manager1 = factory.createEntityManager();
		EntityTransaction tx=manager1.getTransaction();
		tx.begin();
		try {
			BollywoodEntity entity=manager1.find(BollywoodEntity.class, id);
			entity.setActorName(actorName);
			manager1.merge(entity);
			tx.commit();
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager1.close();
		}
		
}

	//@Override
	public void deleteById(Integer id) {
		EntityManager manager2 = factory.createEntityManager();
		EntityTransaction tx=manager2.getTransaction();
		tx.begin();
		try {
			BollywoodEntity entity=manager2.find(BollywoodEntity.class, id);
			manager2.remove(entity);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager2.close();
		}
	}
}
