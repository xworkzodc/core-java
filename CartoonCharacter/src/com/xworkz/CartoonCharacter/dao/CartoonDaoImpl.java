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
	EntityManagerFactory factory = getfactory();



	@Override
	public boolean saveAll(List<Cartoon> enteis) {
		EntityManager manager =factory.createEntityManager();
		try {
			EntityTransaction tx= manager.getTransaction();
			tx.begin();
			for (Cartoon cartoon : enteis) {
				manager.persist(cartoon);
			
			}
			
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return false;
		
	}



	@Override
	public Cartoon findByName(String name) {
		
		EntityManager manager=factory.createEntityManager();
		try {
			
		Query query  =	manager.createNamedQuery("findByName");
		query.setParameter("nm", name);	
		Object object = query.getSingleResult();
		if(object !=null)
		{
			Cartoon cartoon =(Cartoon) object;
			return cartoon;
		}
			
		
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return null;
	}



	@Override
	public Integer total() {//3
		EntityManager manager =factory.createEntityManager();
		try {
	
		Query query= manager.createNamedQuery("total");
		Object object = query.getSingleResult();
		if(object !=null)
		{
			Integer cartoon =(Integer) object;
			return cartoon;
		}
			
			
		} catch (PersistenceException e) {
			
		   e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}



	@Override
	public Cartoon findByMaxCreatedDate() {  //4
		
		return null;
	}



	@Override
	public Cartoon findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender, String author) {//5
	EntityManager manager=factory.createEntityManager();
	try {
		Query query  =	manager.createNamedQuery("findByNameAndCountryAndGenderAndAuthor");
		query.setParameter("nm", name);	
		//query.setParameter("nm1", country);	
		//query.setParameter("nm2", gender);	
		//query.setParameter("nm3", author);	
		Object object=query.getSingleResult();
		
		if(object!=null) {
			Cartoon cartoon=(Cartoon) object;//down//object g =new cartoon();//upcastig
			return cartoon;
		}
		
	} catch (PersistenceException e) {
		e.printStackTrace();
	}finally {
		manager.close();
	}
		return null;
	}



	@Override
	public String findAuthorByName(String name) {//6
		EntityManager manager=factory.createEntityManager();
		try {
			Query query  =	manager.createNamedQuery("findAuthorByName");
			query.setParameter("nm", name);
			
			Object object=query.getSingleResult();
			
			if(object!=null) {
				String string=(String) object;//down
				return string;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
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
	public LocalDateTime findCreatedDateByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void updateAuthorByName(String newAuthir, String name) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateTypeByName(String name) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		
	}



}
