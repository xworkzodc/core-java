package Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.jc.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume_spray","root","Arjunxwork");
		System.out.println(connection);

		 String update ="update  perfume_spraytable  set SrNo = 11 where company_name = 'York'";
		    
	        Statement statement =connection.createStatement();
	      
	        int affected= statement.executeUpdate(update);
	        System.out.println("affected "+affected);
		

}}
