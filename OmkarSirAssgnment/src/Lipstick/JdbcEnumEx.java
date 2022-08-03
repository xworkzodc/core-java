package Lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEnumEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick","root","Arjunxwork");
		Connection connection=DriverManager.getConnection(Db.URL.getValue(),Db.USERNAME.getValue(),Db.PASSWORD.getValue());
		
		//System.out.println(connection);
	
		
		String sql= "Select * from lipsticktable";
		
		Statement statement =connection.createStatement();
		
		ResultSet rs=statement.executeQuery(sql);
		
		int count=0;
		while(rs.next()) {
			count++;
			int srNo= rs.getInt(1);
			String color= rs.getString(2);
			String typ= rs.getString(3);
			int price= rs.getInt(4);
			String company_name= rs.getString(5);
			
			System.out.println(srNo+" "+color+" "+typ+" "+price+" "+company_name);
			
		}
		System.out.println(count);
		
	            /* System.out.println(price);

	             String company_name= rs.getString(5); //get method .
	             System.out.println(typ);*/
		
		
}
}
