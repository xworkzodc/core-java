package com.xworkz.bars.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bars.constant.Bartype;
import com.xworkz.bars.constant.Mysqlpreoperties;
import com.xworkz.bars.dto.BarDto;
import static com.xworkz.bars.constant.Mysqlpreoperties.*;

public class BarDaoImpl implements BarDao {
	public boolean save(BarDto barDto) {
	try {
		Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue())	;
		String insert = "insert into bar.bartable values (" +barDto.getId()+", '"+barDto.getName()+"',  ' "+barDto.getLocation()+ " ',"
				+ "' "+barDto.getAvgCollectionPerDay()+" ,' "+barDto.getCollectionPerMonth()+" ')";
		Statement statement = connection.createStatement();
		Integer rOfA = statement.executeUpdate(insert);
		System.out.println(rOfA);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return false;
	
	
	
	
	}
}