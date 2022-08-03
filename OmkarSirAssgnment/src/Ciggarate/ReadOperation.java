package Ciggarate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import Perfume.EnumDb;

public class ReadOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con=DriverManager.getConnection(EnumDb.URL.getvalue(),EnumDb.USERNAME.getvalue(),EnumDb.PASSWORD.getvalue());
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ciggarate", "root","Arjunxwork");//step2
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ciggarate", "root",
				"Arjunxwork");

        
        Statement statement =connection.createStatement(); //step3
        String sql= "Select * from ciggaratetable";
      // ResultSet rs=statement.executeQuery(sql);
         ResultSet rs=statement.executeQuery(sql); //step4
       

 		boolean result= rs.next(); // this method check data on not in table.
 		System.out.println(result);
 		
		int srNo =rs.getInt(1);
		System.out.println(srNo);
		
	    String white =rs.getString(2);
	    System.out.println(white);
	    
	   
		String ty =rs.getString(3);
		System.out.println(ty);
	   
		String pric =rs.getString(4);
		System.out.println(pric);
		String frng =rs.getString(5);
		System.out.println(frng);
		
        
	}

}
