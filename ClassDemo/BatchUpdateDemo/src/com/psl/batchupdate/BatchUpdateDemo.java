package com.psl.batchupdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateDemo {
	
	
	
	public static void main(String[] args) {
		Connection con = null;
		String s = "select * from emp";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver Loaded");

			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");
			System.out.println("Connection Created");
			
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			/*
			stmt.addBatch("update emp set ename ='Sampat'where id=201");
			stmt.addBatch("update emp set ename ='ashish'where id=204");
			stmt.addBatch("insert into emp values(203,'Vibhuti')");
			stmt.addBatch("insert into emp values(204,'Vishal')");
			stmt.addBatch("insert into emp values(204,'Pooja')");
			stmt.addBatch("insert into emp values(205,'Poornima')");
			
			int i[]= stmt.executeBatch();
			
			for (int j = 0; j < i.length; j++) {
				System.out.println(i[j]) ;
				
			}*/
			
			ResultSet rs =stmt.executeQuery(s);
			rs.absolute(5);
			
			rs.relative(-2);
			
			rs.updateInt(1, 444);
		   
			
			rs.updateRow();
			rs.beforeFirst();
			
			while(rs.next())
				System.out.println(rs.getInt(1) +" "+ rs.getString(2));
			System.out.println("Updated");
			
			
			
		}
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}

}
