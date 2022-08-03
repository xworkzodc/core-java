package com.xworkz.OmkarSriAssgnment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class kingfisherUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kingfisher","root","Arjunxwork");
		
		System.out.println(connection);
		
		String update ="update  kingfishartable  set SrNo = 4 where color = 'redwhite'";
		 Statement statement =connection.createStatement();
	       // int affected= statement.executeUpdate(insert2);
	        int affected= statement.executeUpdate(update);
	        System.out.println("affected "+affected);
		

	}

}
