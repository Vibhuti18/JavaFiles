package com.psl.employeeDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	Connection con = null;

	public Connection conFunction() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver Loaded");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/empdb", "root", "root");
			System.out.println("Connection Created");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
