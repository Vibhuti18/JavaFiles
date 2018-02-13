package com.psl.question4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Client {

	public Set<Student> readFile(String filename) {
		Set<Student> studentSet = new HashSet<Student>();
		Student s = null;
		try {

			File f = new File("Serializestudent.ser");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);

			s = new Student();
			while (fis.available() > 0) {

				s = (Student) ois.readObject();
				studentSet.add(s);

			}
			ois.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return studentSet;

	}

	public Map<Character, Set<Student>> sortStudentsAsPerGrade(
			Set<Student> students) {
		Map<Character, Set<Student>> map = new TreeMap<Character, Set<Student>>();
		Set<Student> temp = null;

		for (Student student : students) {

			map.put(student.getGrade(), temp);
		}

		for (Entry<Character, Set<Student>> et : map.entrySet()) {
			temp = new HashSet<Student>();
			for (Student student : students) {

				if (et.getKey().equals(student.getGrade())) {
					temp.add(student);
				}
			}
			map.put(et.getKey(), temp);
		}
		return map;

	}

	public static void main(String[] args) {

		Client client = new Client();

		Student s = null;
		Set<Student> studentSet = new HashSet<Student>();
		Set<Student> sstudentSet = new HashSet<Student>();
		Map<Character, Set<Student>> mapSet = new TreeMap();

		s = new Student();
		s.setRollNo(1);
		s.setName("Raj");
		s.setStandard(2);
		s.setGrade('A');

		studentSet.add(s);
		s = new Student();
		s.setRollNo(2);
		s.setName("Aditi");
		s.setStandard(5);
		s.setGrade('B');
		studentSet.add(s);

		s = new Student();
		s.setRollNo(3);
		s.setName("Kiran");
		s.setStandard(10);
		s.setGrade('A');
		studentSet.add(s);

		try {

			File f = new File("Serializestudent.ser");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (Student ht : studentSet) {

				oos.writeObject(ht);
			}
			System.out.println("Done");
			oos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();

		}

		sstudentSet = client.readFile("Serializestudent.ser");
		mapSet = client.sortStudentsAsPerGrade(sstudentSet);

		for (Entry<Character, Set<Student>> st : mapSet.entrySet()) {

			System.out.println("  " + st.getKey() + "  ");

			for (Student student : st.getValue()) {

				System.out.println(student.getRollNo() + " "
						+ student.getName() + " " + student.getStandard());

			}
			System.out.println(" ");
		}

	}

}
