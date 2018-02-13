package com.psl.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DataBaseMetaDatademo {
	
	public static void main(String[] args) {
		Connection con = null;
		String s = "select * from emp";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver Loaded");

			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");
			System.out.println("Connection Created");
			java.sql.Statement pstmt = con.createStatement();
			java.sql.DatabaseMetaData db =con.getMetaData();
			
			System.out.println(db.getDatabaseProductName());
			System.out.println(db.getDatabaseMajorVersion());
			
			ResultSet rs = pstmt.executeQuery(s);
			
			
			ResultSetMetaData rsdb = rs.getMetaData();
			System.out.println(rsdb.getTableName(2));
			int count =rsdb.getColumnCount();
			System.out.println(count);
			for (int i = 1; i <=count; i++) {
				
				System.out.println(rsdb.getColumnName(i)+" "+rsdb.getColumnTypeName(i));
				
			}
			
			/*ResultSet rs = db.getTables(null, null, null, null);
			
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			*/
		
			
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	
	

	}
	

}
