package com.psl.question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class DisplayPath {

	static Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	static boolean b = false;

	public void displayFolderContents(String path) {
		File curDir = new File(path);
		List<String> list = new ArrayList<String>();

		File[] filesList = curDir.listFiles();
		for (File f : filesList) {
			if (f.isDirectory()) {
				displayFolderContents(f.getPath());

			}
			if (f.isFile()) {

				list.add(f.getName());

				map.put(f.getParent(), (ArrayList<String>) list);
			}
		}

	}

	public static boolean searchFile(String path, String filename) {
		File curDir = new File(path);
		File[] filesList = curDir.listFiles();
		for (File f : filesList) {
			if (f.isDirectory()) {
				b = searchFile(f.getPath(), filename);
			}

			if (f.isFile()) {
				if (f.getName().equals(filename)) {
					return true;
				}
			}

		}
		return b;
	}

	public int countWords(String filePath) {
		int count = 0;
		String str1, s[] = null;

		File f = new File(filePath);
		try {
			FileInputStream fis = null;
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			while ((str1 = br.readLine()) != null) {
				s = str1.split(" ");
				count = count + s.length;
				s = null;

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	public static void main(String[] args) {

		DisplayPath d = new DisplayPath();

		String s = "C:\\JAVA\\ClassDemo\\InterfaceDemo\\bin\\com\\psl";
		d.displayFolderContents(s);
		System.out.println("***********************");
		// System.out.println(map);
		for (Entry<String, ArrayList<String>> string : map.entrySet()) {
			System.out.println(string.getKey() + " " + string.getValue());
		}

		b = searchFile(s, "ppp.class");
		if (b == true)
			System.out.println("Present");
		else
			System.out.println("Not Present");

		System.out.println("The no.of words in the file are "
				+ d.countWords("test.txt"));

	}

}
