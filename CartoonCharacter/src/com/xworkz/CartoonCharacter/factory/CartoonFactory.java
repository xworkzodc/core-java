package com.xworkz.CartoonCharacter.factory;

//import java.lang.invoke.ClassSpecializer.Factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CartoonFactory {
private static EntityManagerFactory factory;

public static  EntityManagerFactory getfactory() {
	return factory;
}

static {
	factory=Persistence.createEntityManagerFactory("com.xworkz");
}
}
