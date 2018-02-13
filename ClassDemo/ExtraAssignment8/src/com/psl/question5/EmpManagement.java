package com.psl.question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManagement {

	public void addEmp(int empId, String name, String address,
			String contactNo, int salary) {
		try {
			Connection con = new ConnectionClass().connectMethod();
			PreparedStatement stmt = con
					.prepareStatement("insert into emp_table values(?,?,?,?,?)");

			stmt.setInt(1, empId);
			stmt.setString(2, name);
			stmt.setString(3, address);
			stmt.setString(4, contactNo);
			stmt.setInt(5, salary);
			stmt.execute();
			System.out.println("Inserted");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void displayAll() {
		ResultSet r;
		System.out.println(" All the employees are :");
		try {
			Connection con = new ConnectionClass().connectMethod();
			Statement stmt = con.createStatement();
			r = stmt.executeQuery("select empId,empname,address,phone,salary from emp_table");
			while (r.next())
				System.out.println(" " + r.getInt(1) + "\t\t" + r.getString(2)
						+ "\t\t" + r.getString(3) + "\t\t" + r.getString(4)
						+ "\t\t" + r.getInt(5));

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void searchEmp(int empId) {

		ResultSet r;
		try {
			Connection con = new ConnectionClass().connectMethod();
			Statement stmt = con.createStatement();
			r = stmt.executeQuery("select empId,empname,address,phone,salary from emp_table where empId="
					+ empId);
			if (r.next()) {
				

					System.out.println(" " + r.getInt(1) + "\t\t"
							+ r.getString(2) + "\t\t" + r.getString(3) + "\t\t"
							+ r.getString(4) + "\t\t" + r.getInt(5));
				
			} else
				System.out.println("Employee does not exist");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
