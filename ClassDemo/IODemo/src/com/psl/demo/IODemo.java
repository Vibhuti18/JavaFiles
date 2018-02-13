package com.psl.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IODemo {

	public static void main(String[] args) {

		File f = new File("test.txt"); // not actually create file,it is an obj
										// of file.Method creates the file
		if (f.exists()) {
			System.out.println("File Exists");
		}

		else {
			System.out.println("file doe not exist");
			try {
				f.createNewFile(); // this method throws an exception
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // this method actually creates the file
		}
		/*
		 * System.out.println(f.getAbsolutePath()); //complete path
		 * System.out.println(f.getPath()); //path from your project
		 * System.out.println(f.canRead()); System.out.println(f.canWrite());
		 */

		// write in file

		FileOutputStream fos = null;
		String str = "Hello ,world....    hii vibhuti,frw";
		byte b[] = str.getBytes();
		try {
			fos = new FileOutputStream(f);
			fos.write(b);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.flush();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // in case of networks ,buffer readers

		}
		
		
		
		//reads from file
		
		FileInputStream fis = null;
		int i;
		
		try {
			/*fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));   */ //file input stream is derived from  input stream
			//i= fis.read();  //prints ASCII Of 1st character
			
			Scanner sc = new Scanner(f);
			//String str1 = br.readLine();
			sc.useDelimiter(",");
			while(sc.hasNext())
			System.out.println(sc.next());
			//System.out.println(sc.next());
			/*while ((i=fis.read()) != -1) {
				System.out.print((char)(i));
				
			}*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
