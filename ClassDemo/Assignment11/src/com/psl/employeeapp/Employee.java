package com.psl.employeeapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	String str1, s[] = null;
	String query1,query2;
	Date d = null;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	java.sql.Date sqld;
	Connection con;

	public void createConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver Loaded");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/empdb", "root", "root");
			System.out.println("Connection Created");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addRecords() {
		// TODO Auto-generated method stub

		File f = new File("EmployeeDetails.txt");
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));

			while ((str1 = br.readLine()) != null) {

				s = str1.split(" ");
				d = sdf.parse(s[4]);
				sqld = new java.sql.Date(d.getTime());

				query1 = "insert into emp values(" + s[0] + ",'" + s[1] + "','"
						+ s[2] + "'," + s[3] + ",'" + sqld + "'," + s[4] + ","
						+ s[6] + "," + s[7] + ")";
				java.sql.Statement stmt = con.createStatement();
				stmt.execute(query1);

			}

			System.out.println("Query success");
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void firstFiveRecords() {

		System.out.println("first 5 records are");
		try {
			query1 = "select empno,ename,job,hiredate from emp limit 5";
			java.sql.Statement stmt;
			stmt = con.createStatement();
			ResultSet r = stmt.executeQuery(query1);
			while (r.next())
				System.out.println(r.getString(1) + " " + r.getString(2) + " "
						+ r.getString(3) + " " + r.getString(4));
			System.out.println("Query success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void noOfRecords() {
		System.out.println("Number of records are");
		try {
			query1 = "select count(empno) from emp";
			java.sql.Statement stmt;
			stmt = con.createStatement();
			ResultSet r = stmt.executeQuery(query1);
			while (r.next())
				System.out.println(r.getString(1));
			System.out.println("Query success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void display() {

		int empno = 1023;
		try {
			query1 = "select empno,ename,job,hiredate from emp where empno="
					+ empno;
			java.sql.Statement stmt;
			stmt = con.createStatement();
			ResultSet r = stmt.executeQuery(query1);
			// System.out.println(r.wasNull());

			if (!r.next())
				System.out.println("No records found");
			else
				do {
					System.out.println(r.getString(1) + " " + r.getString(2)
							+ " " + r.getString(3) + " " + r.getString(4));
					System.out.println("Query success");

				} while (r.next());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update() {
		int empno = 104;
		try {
			query1 = "update emp set sal=508000 where empno=" + empno;
            query2 = "select sal from emp where empno="+empno;
			java.sql.Statement stmt;
			stmt = con.createStatement();
			ResultSet r = stmt.executeQuery(query2);
		
			if (!r.next())
				System.out.println("No records found");
			else
				do {
					System.out.println(r.getString(1));
					
				} while (r.next());

			

			if (stmt.execute(query1)==false)
				System.out.println("Salary updated");
			else
				System.out.println("No records found");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.createConn();
		// e.addRecords();
		// e.firstFiveRecords();
		// e.noOfRecords();
		//e.display();
		e.update();
	}

}
