package com.xworkz.laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSqlDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume","root","Arjunxwork");
        System.out.println(connection);
        
        String insert = "insert into comapny_info values (6,'lakme','purple', 140,'jaismine')";
        String insert1 = "insert into comapny_info values (7,'lux','red', 150,'jais')";
        String update ="update comapny_info  set price = 350 where frangnance = 'Apple'";
        String del="DELETE FROM comapny_info WHERE id =1";
        		
        		
        
        Statement statement =connection.createStatement();
        int affected= statement.executeUpdate(del);
        System.out.println("affected "+affected);
	}
	

}
