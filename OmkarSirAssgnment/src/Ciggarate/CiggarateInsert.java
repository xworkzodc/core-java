package Ciggarate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CiggarateInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ciggarate","root","Arjunxwork");
		
		System.out.println(connection);
		
		

		    String insert = "insert into ciggaratetable values (1,'white','kingfisher', 140,'100ml')";
		    String insert1 = "insert into ciggaratetable values (2,'white','rum', 220,'200ml')";
		    String insert2 = "insert into ciggaratetable values (3,'white','viscky', 240,'300ml')";
		    String insert3 = "insert into ciggaratetable values (4,'white','cabardi', 300,'400ml')";
		    String insert4= "insert into ciggaratetable values (5,'white','kingfisher', 140,'100ml')";
		    String insert5 = "insert into ciggaratetable values (6,'white','rum', 220,'200ml')";
		    String insert6 = "insert into ciggaratetable values (7,'white','viscky', 240,'300ml')";
		    String insert7 = "insert into ciggaratetable values (8,'redwhite','cabardi', 300,'400ml')";
		    
		    String insert8 = "insert into ciggaratetable values (9,'white','viscky', 240,'300ml')";
		    String insert9 = "insert into ciggaratetable values (10,'white','cabardi', 300,'400ml')";	
	        		
	        
	        Statement statement =connection.createStatement();
	      
	        int affected= statement.executeUpdate(insert9);
	        System.out.println("affected "+affected);

	}

}
