package com.ibm.jdbc_servlet_crud_operation.prepared_statement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JdbcConnection {

	public static Connection getJdbcConnection() {
		
		try {
			//step-1 Load/Register Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step-2 Create Connection
			String url = "jdbc:mysql://localhost:3306/jdbc-a14";
			String user = "root";
			String pass = "root";
			
			return DriverManager.getConnection(url, user, pass);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
