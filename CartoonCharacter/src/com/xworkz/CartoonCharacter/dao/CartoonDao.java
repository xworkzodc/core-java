package com.xworkz.CartoonCharacter.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.CartoonCharacter.entity.Cartoon;

public interface CartoonDao {
	boolean saveAll(List<Cartoon> enteis);// 1

	Cartoon findByName(String name);// 2

	Long total();// 3

	Cartoon findByMaxCreatedDate();//4

	Cartoon findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender, String author);// 5

	String findAuthorByName(String name);//6

	Object[] findNameAndCountryByAuthor(String author);//7

	LocalDateTime findCreatedDateByAuthor(String author);//8

	void updateAuthorByName(String author, String name);//9

	void updateTypeByName(String name);//10

	void deleteByName(String name);//11

//18-08-22
	List<Cartoon> findAll();

	List<Cartoon> findAllByAuthor(String author);

	List<Cartoon> findAllByAuthorAndGender(String author, String gender);

	List<String> findAllName();

	List<String> findAllCountryName();

	List<Object[]> findAllNameAndCountry();
	List<Object[]> findAllNameAndCountryAndAuthor();
}