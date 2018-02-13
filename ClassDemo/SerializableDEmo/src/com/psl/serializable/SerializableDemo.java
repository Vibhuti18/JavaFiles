package com.psl.serializable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo{

	public static void main(String[] args) {

		// just writing objects in to a file
		// comma seperated file

		Employee e1 = new Employee(107, 5000000, "Vibhuti");

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
		
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(e1);
			
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
