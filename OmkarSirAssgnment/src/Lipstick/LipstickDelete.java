package Lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick","root","Arjunxwork");
		
		System.out.println(connection);
		
		

		 /*   String del ="DELETE FROM lipsticktable WHERE SrNo =2";
		    
	        Statement statement =connection.createStatement();
	      
	        int affected= statement.executeUpdate(del);
	        System.out.println("affected "+affected);*/
		String sql= "Select * from lipsticktable";
		Statement statement =connection.createStatement();
		
		ResultSet rs=statement.executeQuery(sql);
		System.out.println(rs);
                      boolean resultsetnext    = rs.next();		
                      System.out.println(resultsetnext);
	                  int id= rs.getInt(1); //get method .
	                  System.out.println(id);
	             
	             
	             
	             
	}

}
