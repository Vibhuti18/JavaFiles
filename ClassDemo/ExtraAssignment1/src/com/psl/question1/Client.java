package com.psl.question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Client {

	static Set<Book> set = new TreeSet<Book>();
	static List<Book> list = new ArrayList<Book>();

	public static void addBook(Book b) {

		set.add(b);

	}

	public void print() {

		System.out.println("ALL THE BOOKS ARE");
		Book b = new Book();
		Iterator<Book> it = set.iterator();
		while (it.hasNext()) {
			b = it.next();
			System.out.println(b.toString());
		}

	}

	public ArrayList<Book> searchOnBook(String str) {
		List<Book> list1 = new ArrayList<Book>();
		BookCategory b = BookCategory.valueOf(str.toUpperCase());
		Book b1 = new Book();
		Iterator<Book> it = set.iterator();
		while (it.hasNext()) {
			b1 = it.next();
			if (b1.book_category.equals(b))
				list1.add(b1);

		}

		return (ArrayList<Book>) list1;
	}

	public static void main(String[] args) {

		Book b = null;
		String str = "COMPUTER";
		Client c = new Client();

		// BookCategory e[] = BookCategory[1].valueOf();
		File f = new File("book_details.csv");
		int i;
		String str1;
		String s[] = new String[20];
		try {

			FileInputStream fis = null;
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			while ((str1 = br.readLine()) != null) {

				s = str1.split(",");
				b = new Book();
				b.setBook_id(Integer.parseInt(s[0]));

				b.setBook_name(s[1].toString());

				b.setBook_author(s[2]);

				b.setBook_price(Double.parseDouble(s[3]));

				BookCategory bc = BookCategory.valueOf(s[4].toUpperCase());
				b.book_category = bc;

				c.addBook(b);

			}
			c.print();
			list = c.searchOnBook(str);

			System.out.println("The " + str + "books are \n");
			Book b11 = new Book();
			Iterator<Book> it = list.iterator();
			while (it.hasNext()) {
				b11 = it.next();
				System.out.println(b11.toString());
			}

			// System.out.println(set);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
