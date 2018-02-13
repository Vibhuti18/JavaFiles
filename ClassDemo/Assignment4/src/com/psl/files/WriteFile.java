package com.psl.files;

import java.io.*;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {
		FileReader source = null;
		FileWriter destination = null;
		Scanner s = new Scanner(System.in);
		String str;

		try {

			source = new FileReader(args[0]);
			destination = new FileWriter(args[1]);

			System.out.println("Do you want to overwrite?");
			str = s.next();
			if (str.equals("yes")) {
				int c;
				while ((c = source.read()) != -1) {
					destination.write(c);
				}
				System.out.println("Overwrite Successful");
			} else {
				System.out.println("Operation Terminated");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Source file not found");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (source != null) {
				try {
					((Closeable) source).close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (destination != null) {
				try {
					((Closeable) destination).close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
