package com.xworkz.freedomFighters.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.freedomFighters.entity.FreedomEntity;
import static com.xworkz.freedomFighters.factory.FactoryUtil.*;

import java.util.List;

public class FreedomDaoImpl implements FreedomDao {
	EntityManagerFactory factory = getFactory();

	@Override
	public boolean addAll(List<FreedomEntity> entities) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (FreedomEntity freedomEntity : entities) {

				manager.persist(freedomEntity);

			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return false;
	}

}
