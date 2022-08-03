package Ciggarate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOperationWhile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ciggarate", "root",
			"Arjunxwork");
	
	  Statement statement =connection.createStatement(); //step3
      String sql= "Select * from ciggaratetable";
    // ResultSet rs=statement.executeQuery(sql);
       ResultSet rs=statement.executeQuery(sql); //step4
     int count=0;
     while(rs.next()) {
    	 count++;
    	
    	
    	 
    	    int id =rs.getInt(1);
            if(id==5) {
            	 System.out.println("this is 5");
            	
            }
         
            else {
			String company_name=rs.getString(2); 
			
			String typ=rs.getString(3);
			
            String price =rs.getString(4);
			
			String frang=rs.getString(5);
            
			System.out.println(id+" "+company_name+" "+typ+" "+price+" "+frang);
            }
			
     }
     System.out.println(count);

	}

}
