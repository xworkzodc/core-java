package com.xworkz.OmkarSriAssgnment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Kingfisher { // insert

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kingfisher","root","Arjunxwork");
		
		System.out.println(connection);
		
		

		    String insert = "insert into kingfishartable values (1,'red','kingfisher', 140,'100ml')";
		    String insert1 = "insert into kingfishartable values (2,'redblack','rum', 220,'200ml')";
		    String insert2 = "insert into kingfishartable values (3,'redblue','viscky', 240,'300ml')";
		    String insert3 = "insert into kingfishartable values (1,'redwhite','cabardi', 300,'400ml')";
		    String insert4= "insert into kingfishartable values (1,'red','kingfisher', 140,'100ml')";
		    String insert5 = "insert into kingfishartable values (2,'redblack','rum', 220,'200ml')";
		    String insert6 = "insert into kingfishartable values (3,'redblue','viscky', 240,'300ml')";
		    String insert7 = "insert into kingfishartable values (1,'redwhite','cabardi', 300,'400ml')";
		    
		    String insert8 = "insert into kingfishartable values (3,'redblue','viscky', 240,'300ml')";
		    String insert9 = "insert into kingfishartable values (1,'redwhite','cabardi', 300,'400ml')";	
	        		
	        
	        Statement statement =connection.createStatement();
	      
	        int affected= statement.executeUpdate(insert9);
	        System.out.println("affected "+affected);
		

	}

}
