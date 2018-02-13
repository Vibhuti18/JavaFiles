package com.psl.question1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {


	public static void main(String[] args) {

		String fpath = "C:\\Users\\Administrator\\Desktop\\Test\\Test1\\Test2", fname = "Hello.txt";
		File f = new File(fname);
		FileDemo fd = new FileDemo();
		if (f.exists())
			System.out.println("File is present");
		else {
			System.out.println("File not found ");
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Absolute path is ");
		System.out.println(f.getAbsolutePath());
		System.out.println(" File is readable --" + f.canRead()
				+ " File is writable -- " + f.canWrite());
		
		String str = "Hello World!";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
			//bw.write(str);
		
			
			bw.write(" I am not overwrittern");
			System.out.println("write successful");
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
