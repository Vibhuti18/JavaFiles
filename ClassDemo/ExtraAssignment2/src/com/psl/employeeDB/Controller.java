package com.psl.employeeDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {
	
	
	
	public static void main(String[] args) {
		String empdesignation  = "developer";
		String query1="select * from empdetails";
		String query2="select empid ,empname  from empdetails where empdesignation ='"+empdesignation+"'";
		Statement stmt = null;
		ResultSet r = null;
		
		Controller c=new Controller();
		ConnectionClass cc = new ConnectionClass();
		Connection con = cc.conFunction();
		 try {
			 stmt = con.createStatement();
			
			r= stmt.executeQuery(query1);
			while(r.next())
				System.out.println(" " + r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getInt(4));
			
   
			
			 r= stmt.executeQuery(query2);
			while(r.next())
				System.out.println(" " + r.getInt(1)+" "+r.getString(2));
			
          java.sql.PreparedStatement pstmt = con.prepareStatement("update empdetails set empdesignation = ?,empsalary =? where empid =?");
			
          Scanner sc = new Scanner(System.in);
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter designation and salary:");
			 empdesignation = sc.next();
			 int sal = sc.nextInt();
			
			
			pstmt.setString(1, empdesignation);
			pstmt.setInt(2, sal);
			pstmt.setLong(3,id);
			pstmt.execute();
			
			stmt.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
