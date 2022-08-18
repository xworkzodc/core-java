package com.xworkz.CartoonCharacter.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.CartoonCharacter.entity.Cartoon;

public interface CartoonDao {
boolean saveAll(List<Cartoon>enteis);//1
	

Cartoon findByName(String name);//2

Integer total();//3

Cartoon findByMaxCreatedDate();
Cartoon findByNameAndCountryAndGenderAndAuthor(String name ,String country,String gender,String author);//5
String findAuthorByName(String name);

Object[] findNameAndCountryByAuthor(String author);
LocalDateTime findCreatedDateByAuthor(String author);
void updateAuthorByName(String newAuthir,String name);
void updateTypeByName(String name);
void deleteByName(String name); 

}