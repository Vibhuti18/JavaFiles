package com.psl.deserializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableDemo {

	
	public static void main(String[] args) {
		
		File f = new File("test.ser"); // not actually create file,it is an obj
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
		
		try {
			FileInputStream fis  = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e = (Employee) ois.readObject();
			System.out.println(e);
			System.out.println("done");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
