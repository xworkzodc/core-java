package com.xworkz.politician.dao;

import com.xworkz.politician.dto.PoliticianDto;

public interface PoliticianDao {
	
boolean save (PoliticianDto politicianDto);
PoliticianDto findById(int id);
PoliticianDto findByIdAndPresident(int id,String president);
PoliticianDto findByIdAndPresidentAndName(int id, String name,String president);

String findNameById(int id);//6
//PoliticianDao findByIdName(String name,int id);
PoliticianDto findByIdName(int id, String name);//5--->6
String findPresidentByIdAndName(int id, String name);//7
int getTotal();
PoliticianDto  findPartyByMaxMembers();


}
