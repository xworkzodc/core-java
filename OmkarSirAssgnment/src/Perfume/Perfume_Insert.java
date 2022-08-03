package Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Perfume_Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume_spray","root","Arjunxwork");
		
		System.out.println(connection);
		
		

		    String insert = "insert into perfume_sprayTable values (1,'red','kingfisher', 140,'York')";
		    String insert1 = "insert into perfume_sprayTable values (2,'redblack','Sugandhco', 220,'Lakme.')";
		    String insert2 = "insert into perfume_sprayTable values (3,'redblue','Skinn by Titan', 240,'NYX')";
		    String insert3 = "insert into perfume_sprayTable values (4,'redwhite','Embark.', 300,'LOreal Paris')";
		    String insert4= "insert into perfume_sprayTable values (5,'red','kingfisher', 140,'Sugar')";
		    String insert5 = "insert into perfume_sprayTable values (6,'redblack','rum', 220,'Faces Canada')";
		    String insert6 = "insert into perfume_sprayTable values (7,'redblue','viscky', 240,'Elle 18.')";
		    String insert7 = "insert into perfume_sprayTable values (8,'redwhite','cabardi', 300,'Glides smoothly')";
		    
		    String insert8 = "insert into perfume_sprayTable values (9,'redblue','viscky', 240,'Cruelty-free')";
		    String insert9 = "insert into perfume_sprayTable values (10,'redwhite','Bombay Perfumery.', 300,'Highly pigmented')";	
	        		
	        
	        Statement statement =connection.createStatement();
	      
	        int affected= statement.executeUpdate(insert9);
	        System.out.println("affected "+affected);

	}

}
