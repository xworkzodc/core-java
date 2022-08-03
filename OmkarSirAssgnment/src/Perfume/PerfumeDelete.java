package Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume_spray","root","Arjunxwork");
		System.out.println(connection);
		
		

		    String del ="DELETE FROM perfume_spraytable WHERE SrNo =3";
		    
	        Statement statement =connection.createStatement();
	      
	        int affected= statement.executeUpdate(del);
	        System.out.println("affected "+affected);

	}

}
