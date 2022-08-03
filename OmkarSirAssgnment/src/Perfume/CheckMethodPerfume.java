package Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckMethodPerfume {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");//step 1
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume", "root",
    				"Arjunxwork");//step2
		String sql= "Select * from comapny_info";
		Statement statement =connection.createStatement(); //step3
		ResultSet rs=statement.executeQuery(sql); //step4
		
		boolean result= rs.next(); // this method check data on not in table.
		System.out.println(result);
		
		int id =rs.getInt("id");
		System.out.println(id);
		String company_name=rs.getString(2);
		System.out.println(company_name);
		String typ=rs.getString("typ");
		System.out.println(typ);
		int price =rs.getInt(4);
		System.out.println(price);
		String frang=rs.getString(5);
		System.out.println(frang);
		
		
	}

}
