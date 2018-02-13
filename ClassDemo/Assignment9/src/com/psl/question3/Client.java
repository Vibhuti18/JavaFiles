package com.psl.question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Client {
	private static final String FILENAME = "C:\\JAVA\\ClassDemo\\Assignment9\\src\\com\\psl\\question3\\Demo.txt";

	static Set<CityStateMap> hashSet = new HashSet<CityStateMap>();

	static Set<String> array = new HashSet<String>();

	public void addUsers(CityStateMap c) {
		// TODO Auto-generated method stub
		CityStateMap t = new CityStateMap();

		Iterator it1 = hashSet.iterator();
		while (it1.hasNext()) {

			t = (CityStateMap) it1.next();
			if (t.city == c.city) {
				it1.remove();
				break;
			}

		}
		if (!(array.contains(c.state))) {
			array.add(c.state);
		}
		hashSet.add(c);
		System.out.println(hashSet);

	}

	public void getAllCities() {
		// TODO Auto-generated method stub
		System.out.println("All Cities are");
		Iterator<CityStateMap> it = hashSet.iterator();
		CityStateMap cit;
		while (it.hasNext()) {
			cit = it.next();
			System.out.print(cit.getCity() + "  ");
		}

	}

	public void getAllStates() {
		// TODO Auto-generated method stub
		System.out.println(" All States are");
		Iterator<String> it = array.iterator();
		System.out.println("");
		while (it.hasNext()) {

			System.out.print(it.next() + " ");
		}

	}

	public void deleteAllCitites(String string) {
		// TODO Auto-generated method stub

		Iterator<CityStateMap> it = hashSet.iterator();

		while (it.hasNext()) {
			if (it.next().getState().equals(string)) {
				it.remove();
			}
		}

		for (CityStateMap c : hashSet) {

			System.out.println(c);
		}

	}

	public void addNewCityPair(CityStateMap c7) {
		// TODO Auto-generated method stub

		for (int i = 0; i < array.size(); i++) {
			if (!(array.contains(c7.state)))
				array.add(c7.state);

		}

		hashSet.add(c7);

	}

	public void getCitiesForState(String str) {
		// TODO Auto-generated method stub
		CityStateMap t;

		System.out.println("Cities of state " + str + " are");
		Iterator<CityStateMap> it = hashSet.iterator();

		while (it.hasNext()) {
			t = it.next();
			if (t.getState().equals(str)) {
				System.out.println(t.getCity());
			}
		}

	}

	public static void main(String[] args) {

		Client obj = new Client();

		BufferedReader br = null;
		FileReader fr = null;
		int h = 0;
		CityStateMap c2[] = new CityStateMap[10];

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				c2[h] = new CityStateMap();

				String[] tokens = sCurrentLine.split("\\s+");
				c2[h].setCity(tokens[0]);
				c2[h].setState(tokens[1]);
				obj.addUsers(c2[h]);
				h++;
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		CityStateMap c7 = new CityStateMap();
		c7.state = "Gujrat";
		c7.city = "Ahmedabad";
		obj.addNewCityPair(c7);
		obj.getAllCities();

		obj.getAllStates();
		obj.getCitiesForState("Goa");

		// obj.deleteAllCitites("Goa");
		//
	}

}
