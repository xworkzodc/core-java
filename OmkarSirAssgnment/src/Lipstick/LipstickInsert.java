package Lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Arjunxwork");

		System.out.println(connection);

		String insert = "insert into lipstickTable values (1,'red','kingfisher', 140,'York')";
		String insert1 = "insert into lipstickTable values (2,'redblack','rum', 220,'Lakme.')";
		String insert2 = "insert into lipstickTable values (3,'redblue','viscky', 240,'NYX')";
		String insert3 = "insert into lipstickTable values (4,'redwhite','cabardi', 300,'LOreal Paris')";
		String insert4 = "insert into lipstickTable values (5,'red','kingfisher', 140,'Sugar')";
		String insert5 = "insert into lipstickTable values (6,'redblack','rum', 220,'Faces Canada')";
		String insert6 = "insert into lipstickTable values (7,'redblue','viscky', 240,'Elle 18.')";
		String insert7 = "insert into lipstickTable values (8,'redwhite','cabardi', 300,'Glides smoothly')";

		String insert8 = "insert into lipstickTable values (9,'redblue','viscky', 240,'Cruelty-free')";
		String insert9 = "insert into lipstickTable values (10,'redwhite','cabardi', 300,'Highly pigmented')";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(insert);
		    System.out.println("affected " + affected);
		    affected = statement.executeUpdate(insert2);
		    System.out.println("affected " + affected);
		    affected = statement.executeUpdate(insert3);
		    System.out.println("affected " + affected);
		    affected = statement.executeUpdate(insert4);
		    affected = statement.executeUpdate(insert5);
		    affected = statement.executeUpdate(insert6);
		    affected = statement.executeUpdate(insert7);
		    affected = statement.executeUpdate(insert8);
		    affected = statement.executeUpdate(insert9);
		    
		    
		System.out.println("affected " + affected);

	}

}
