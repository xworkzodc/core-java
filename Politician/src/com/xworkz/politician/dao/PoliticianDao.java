package com.xworkz.politician.dao;

import com.xworkz.politician.dto.PoliticianDto;

public interface PoliticianDao {
boolean save (PoliticianDto politicianDto);
PoliticianDto findById(int id);
PoliticianDto findByIdAndPresident(int id,String president);
PoliticianDto findByIdAndPresidentAndName(int id, String name,String president);

String findNameById(int id,String name);//6

PoliticianDto findByIdName(String name,int id);//5
}
