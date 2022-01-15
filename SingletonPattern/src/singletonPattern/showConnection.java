package singletonPattern;

import java.sql.*;

public class showConnection {
	
	public static void main(String[] args) {
		Connection conn = SQLConnection.getConnection();
	}
}
