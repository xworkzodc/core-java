package com.xworkz.freedomFighters.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactoryUtil {
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getFactory() {
		return factory;
		
	}
	static {
		factory=Persistence.createEntityManagerFactory("com.xworkz");
	}
}
