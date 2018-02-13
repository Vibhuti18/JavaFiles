package com.psl.collectiondemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(3, "Vibhuti");
		map.put(1, "Pooja"); // takes recent data
		map.put(2, "Sampat");
		map.put(3, "Nidhi");
		map.put(4, "Nidhi");
		map.put(5, "Hazia");

		System.out.println(map.get(3));

		Iterator<Integer> it = map.keySet().iterator();

		while (it.hasNext()) {
			Integer i = it.next();

			System.out.println(i + map.get(i));

		}

		Iterator it1 = map.entrySet().iterator();

		while (it1.hasNext()) {

			System.out.println("Entry " + it1.next());

		}

		for (Entry<Integer, String> string : map.entrySet()) { // most efficient
																// method easist

			System.out.println("Entry 1 " + string.getKey()); // Entry has got
																// private
																// methods
																// getkey and
																// get value

		}
	}

}
