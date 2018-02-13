package com.psl.question1;

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

public class MoviesDemo {
	String str1, s[] = null;
	String query1;
	Date d = null;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	java.sql.Date sqld;
	Connection con;

	public void createConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver Loaded");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/moviesdb", "root", "root");
			System.out.println("Connection Created");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addFromFile() {
		File f = new File("movies.txt");
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));

			while ((str1 = br.readLine()) != null) {

				s = str1.split(",");
				d = sdf.parse(s[3]);
				sqld = new java.sql.Date(d.getTime());
				// query1 =
				// "insert into movies values("+Integer.parseInt(s[0])+",'"+s[1]+"','"
				// +s[2]+"','"+sqld+"')";
				java.sql.Statement stmt = con.createStatement();
				// stmt.execute(query1);
			}
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

	public void addNewMovie() {
		try {
			d = sdf.parse("18/09/2017");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqld = new java.sql.Date(d.getTime());
		query1 = "insert into movies values(" + 9 + ",'" + "Simran" + "','"
				+ "Hindi" + "','" + sqld + "')";
		java.sql.Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute(query1);
			System.out.println("Query success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addNewShow() {
		try {
			d = sdf.parse("21/10/2017");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqld = new java.sql.Date(d.getTime());
		// System.out.println("insert into shows values(" + 2 + "," + 9 + ",'" +
		// sqld + "')");
		query1 = "insert into shows values(" + 2 + "," + 9 + ",'" + sqld + "')";
		java.sql.Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute(query1);
			System.out.println("Query success" + " New show added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteShow() {
		query1 = "delete from shows where showId = 1";
		java.sql.Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute(query1);
			System.out.println("Query success" + "  show deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateShow() {
		try {
			d = sdf.parse("25/10/2017");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqld = new java.sql.Date(d.getTime());
		query1 = "UPDATE shows SET day ='" + sqld + "' WHERE showID =" + 2;
		java.sql.Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute(query1);
			System.out.println("Query success" + " date updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void displayMoviesByLanguage() {

		try {
			String str = "Hindi";
			query1 = "select name,language from movies where language='" + str
					+ "'";
			java.sql.Statement stmt;
			stmt = con.createStatement();
			ResultSet r = stmt.executeQuery(query1);
			System.out.println(str + " Movies are");
			while (r.next())
				System.out.println(r.getString(1) + " " + r.getString(2));
			System.out.println("Query success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void displayMoviesByDate() {
		try {
			d = new Date();
			sqld = new java.sql.Date(sdf.parse(sdf.format(d)).getTime());
			query1 = "select name,day from movies join shows on movies.id=shows.id where shows.day='"
					+ sqld + "'";
			System.out.println("select name,day from movies join shows on movies.id=shows.id where shows.day='"
					+ sqld + "'");
			java.sql.Statement stmt;
			stmt = con.createStatement();
			ResultSet r = stmt.executeQuery(query1);
			while (r.next())
				System.out.println(r.getString(1) + " " + r.getString(2));
			System.out.println("Query success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void booking() {
		// TODO Auto-generated method stub
		
		String userName= "Samrudhi";
		int showId = 13;
		query1 = "insert into book values( " + showId + ",'" + userName +"',"+0+")";
		java.sql.Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute(query1);
			System.out.println("Query success" + " New booking added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void displayAllBookings() {
		
		try {
			query1 = "select day,uname,name from shows join book on shows.showId=book.showId join movies on movies.id=shows.id";
			
			java.sql.Statement stmt;
			stmt = con.createStatement();
			ResultSet r = stmt.executeQuery(query1);
			while (r.next())
				System.out.println(r.getString(1) + " " + r.getString(2)+ " " + r.getString(3));
			System.out.println("Query success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public void displayAllMovies() {
		
		try {
			query1 = "select distinct day,name from shows join movies";
			
			java.sql.Statement stmt;
			stmt = con.createStatement();
			ResultSet r = stmt.executeQuery(query1);
			while (r.next())
				System.out.println(r.getString(1) + " " + r.getString(2));
			System.out.println("Query success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	public static void main(String[] args) {
		MoviesDemo m = new MoviesDemo();
		m.createConn();
		m.booking();
		// m.addFromFile();
		// m.addNewMovie();
		// m.addNewShow();
		// m.deleteShow();
		// m.updateShow();
		// m.displayMoviesByLanguage();
		//m.displayMoviesByDate();
		//m.displayAllBookings();
		//m.displayAllMovies();

	}


}
