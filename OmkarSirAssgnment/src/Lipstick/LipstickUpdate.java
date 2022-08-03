package Lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Arjunxwork");

		System.out.println(connection);

		String update = "update  lipsticktable  set SrNo = 11 where company_name = 'York'";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(update);
		System.out.println("affected " + affected);

	}

}
