package com.psl.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JBDCDemo {

	public static void main(String[] args) {

		// String query = "Create table emp(id int(10),ename varchar(20))";
		String query1 = "select id,ename from emp";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver Loaded");
			// con gives us the socket
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");
			System.out.println("Connection Created");

			java.sql.Statement stmt = con.createStatement(); // queries are all
																// stored in
																// Statement

			ResultSet r= stmt.executeQuery(query1);
			while(r.next())
			System.out.println("Query Fired" + r.getInt(1)+r.getString(2));
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
