package com.xworkz.politician.dao;

import com.xworkz.politician.dto.PoliticianDto;

public interface PoliticianDao {
boolean save (PoliticianDto politicianDto);
PoliticianDto findById(int id);
}
