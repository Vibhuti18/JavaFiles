package com.psl.question2;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOClass {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out
				.println("enter the String which you want to input to the file");
		str = s.nextLine();

		File f = null;
		FileWriter out = null;
		FileReader in = null;
		try {

			f = new File("io.txt");
			out = new FileWriter(f);
			out.write(str);
			out.close();
			System.out.println("the length of the file is" + f.length());
			in = new FileReader(f);
			System.out.println("The contents of the file are:");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("Source file not found");
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {

			if (out != null) {
				try {
					((Closeable) out).close();
					out.close();
					in.close();
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (f.delete())
			System.out.println("Delete Successful");

	}
}
