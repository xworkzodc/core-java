package com.xworkz.politician.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.politician.dto.PoliticianDto;
import static com.xworkz.politician.constants.MysqlProperties.*;

public class PoliticianDaoImpl implements PoliticianDao{

	@Override
	public boolean save(PoliticianDto politicianDto) {
		try(Connection connection =DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue());) {
		
		
			//Before this program we are using this type method======Connection connection =DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue());
			
			String insert="INSERT into Politician.Politician_info values(?,?,?,?,?,?,?,?,?)";
			 PreparedStatement  preparedStatement =connection.prepareStatement(insert);
			 preparedStatement.setInt(1, politicianDto.getId());
			 preparedStatement.setString(2,politicianDto.getName());
			 preparedStatement.setString(3, politicianDto.getPartyname());
			 preparedStatement.setString(4, politicianDto.getPresident());
			 preparedStatement.setInt(5, politicianDto.getTotalmembers());
			 preparedStatement.setDouble(6, politicianDto.getBudget());
			 preparedStatement.setString(7, politicianDto.getHeadquaters());
			 preparedStatement.setString(8, politicianDto.getPartylocation());
			 preparedStatement.setString(9, politicianDto.getPartysysmbol());
			 int noOf=preparedStatement.executeUpdate();
			 if(noOf>0) {
				 System.out.println("the value are inserted"+insert);
			 }
			 else {
				 System.out.println("value are not inserted");
			 }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public PoliticianDto findById(int id) {
		
		try (Connection connection =DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue());){
		//	Connection connection =DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue());
			String select="SELECT * From politician.politician_info where id= ?";
			PreparedStatement  preparedStatement =connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
		    System.out.println(resultSet);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}
