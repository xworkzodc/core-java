package com.xworkz.mahindra.dao;

import com.xworkz.mahindra.entity.MahindraEntity;

public interface MahindraDao {
boolean save(MahindraEntity mahindraEntity);
MahindraEntity findById(Integer id);
MahindraEntity updatecarNameById(String carName ,Integer id);
void deleteById(Integer id);
}
