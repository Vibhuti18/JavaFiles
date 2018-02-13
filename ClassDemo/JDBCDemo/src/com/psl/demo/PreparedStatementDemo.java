package com.psl.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
	
	
	public static void main(String[] args) {
		
		//String query1 = "select id,ename from emp";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver Loaded");
			// con gives us the socket
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");
			System.out.println("Connection Created");

			/*java.sql.PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?)");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter name:");
			String name = sc.next();
			
			pstmt.setInt(1, 123);
			pstmt.setString(2, name);
			pstmt.execute();
			*/
			
			CallableStatement cstmt = con.prepareCall("{ call Myprocedure(?,?)}");
			
			
			
			System.out.println("Callable stmt");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter name:");
			String name = sc.next();
			cstmt.setInt(1, id);
			cstmt.setString(2, name);
			cstmt.execute();
		
			
			
			
			System.out.println("Entry addded");

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
	}
	


}
