package Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Lipstick.Db;

public class CheckReadMethodByWhile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");//step 1
		Connection connection=DriverManager.getConnection(EnumDb.URL.getvalue(),EnumDb.USERNAME.getvalue(),EnumDb.PASSWORD.getvalue());
		String sql= "Select * from comapny_info";
		Statement statement =connection.createStatement(); //step3
		ResultSet rs=statement.executeQuery(sql); //step4
		
		int count=0;
		while(rs.next()) {
			count++;
			int id =rs.getInt("id");
			
			String company_name=rs.getString(2);
			
			String typ=rs.getString("typ");
			
			int price =rs.getInt(4);
			
			String frang=rs.getString(5);
			
			System.out.println(id+" "+company_name+" "+typ+" "+price+" "+frang);
		}
		System.out.println(count);
	}
	

}
