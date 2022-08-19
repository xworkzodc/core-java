package com.xworkz.CartoonCharacter.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.CartoonCharacter.entity.Cartoon;

//import com.xworkz.CartoonCharacter.entity.Cartoon;
import static com.xworkz.CartoonCharacter.factory.CartoonFactory.*;

import java.time.LocalDateTime;
import java.util.List;

//improt static com.xworkz.CartoonCharecter.factory.CartoonFactory.*;
public class CartoonDaoImpl implements CartoonDao {
      private	EntityManagerFactory factory = getfactory();

	@Override
	public boolean saveAll(List<Cartoon> enteis) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (Cartoon cartoon : enteis) {
				manager.persist(cartoon);

			}

			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return false;

	}

	@Override
	public Cartoon findByName(String name) {

		EntityManager manager = factory.createEntityManager();
		try {

			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			Object object = query.getSingleResult();
			if (object != null) {
				Cartoon cartoon = (Cartoon) object;
				return cartoon;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Long total() {// 3
		EntityManager manager = factory.createEntityManager();
		try {

			Query query = manager.createNamedQuery("total");
			Object object = query.getSingleResult();
			System.out.println(object);
			if (object != null) {
				Long cartoon = (Long) object;
				return cartoon;
			}

		} catch (PersistenceException e) {

			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Cartoon findByMaxCreatedDate() { // 4

		return null;
	}

	@Override
	public Cartoon findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender, String author) {// 5
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndCountryAndGenderAndAuthor");
			query.setParameter("nm", name);
			// query.setParameter("nm1", country);
			// query.setParameter("nm2", gender);
			// query.setParameter("nm3", author);
			Object object = query.getSingleResult();

			if (object != null) {
				Cartoon cartoon = (Cartoon) object;// down//object g =new cartoon();//upcastig
				return cartoon;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public String findAuthorByName(String name) {// 6
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAuthorByName");
			query.setParameter("nm", name);

			Object object = query.getSingleResult();

			if (object != null) {
				String string = (String) object;// down
				return string;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDateTime findCreatedDateByAuthor(String author) { // 8
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findCreatedDateByAuthor");
			// manager.setProperty(author, query);
			query.setParameter("an", author);
			Object object = query.getSingleResult();
			if (object != null) {
				 LocalDateTime date = (LocalDateTime) object;// down
				return date;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String author, String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateAuthorByName");
			query.setParameter("nm", author);
			query.setParameter("am", name);
			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
	}

	@Override
	public void updateTypeByName(String name) {
	EntityManager manager=	factory.createEntityManager();
	try {
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		Query query=manager.createNamedQuery("updateTypeByName");
		//query.setParameter("nm", type);
		query.setParameter("nm", name);
		query.executeUpdate();
		tx.commit();
		
	} catch (PersistenceException e) {
		e.printStackTrace();
	}finally {
		manager.close();
	}

	}

	@Override
	public void deleteByName(String name) {                       //11
		EntityManager manager=	factory.createEntityManager();
		try {
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
			Query query=manager.createNamedQuery("deleteByName");
			//query.setParameter("nm", type);
			query.setParameter("nm", name);
			query.executeUpdate();
			tx.commit();
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}

		}

	
//18-08-22

	@Override
	public List<Cartoon> findAll() {
		EntityManager manager = factory.createEntityManager();
		try {
			// EntityTransaction tx=manager.getTransaction();
			Query query = manager.createNamedQuery("findAll");
			List<Cartoon> result = query.getResultList();
			if (result != null) {
				return result;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cartoon> findAllByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllByAuthor");
			query.setParameter("an", author);
			List<Cartoon> result = query.getResultList();
			if (result != null) {
				return result;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cartoon> findAllByAuthorAndGender(String author, String gender) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllByAuthorAndGender");
			query.setParameter("an", author);
			query.setParameter("am", gender);
			List<Cartoon> result = query.getResultList();
			if (result != null) {
				return result;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> findAllName() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllName");
			List<String> result = query.getResultList();
			if (result != null) {
				return result;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<String> findAllCountryName() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllCountryName");
			List<String> result = query.getResultList();
			if (result != null) {
				return result;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<Object[]> findAllNameAndCountry() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllNameAndCountry");
			List<Object[]> result = query.getResultList();
			if (result != null) {
				return result;

			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<Object[]> findAllNameAndCountryAndAuthor() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllNameAndCountryAndAuthor");
			List<Object[]> result = query.getResultList();
			if (result != null) {
				return result;

			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

}
