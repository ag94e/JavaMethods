package singletonPattern;

import java.sql.*;

public class SQLConnection {

	private static Connection connection;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin123");
			System.out.println("Database connected");
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		
		if (connection == null) {
			new SQLConnection();
		}
		return connection;
	}
}
