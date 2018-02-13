package com.psl.question4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Client {

	static Map<String, Integer> map = new HashMap<String, Integer>();
	Set<Character> set = new HashSet<Character>();

	private int readUniqueCharacters(String str) {
		// TODO Auto-generated method stub
		Iterator it1 = map.entrySet().iterator();
		int i = -1;
		for (Entry<String, Integer> string : map.entrySet()) {
			
		if (string.getKey() == str) {
				i = string.getValue();
				System.out.println("Alert!! String already present in map");
				break;
				// private
			}
		}

		if (i == -1) {
			for (int i1 = 0; i1 < str.length(); i1++) {
				if (set.contains(str.charAt(i1)))
					continue;
				else
					set.add(str.charAt(i1));

			}
			map.put(str, set.size());
			i = set.size();
		}

		return i;
	}

	public static void main(String[] args) {
		int c2;
		String str;

		Client c = new Client();
		Client cc = new Client();
		Client ccc = new Client();
		Client c4 = new Client();

		str = "Hello";
		c2 = c.readUniqueCharacters(str);
		System.out.println(str + " " + c2);

		str = "Ram";
		c2 = cc.readUniqueCharacters(str);
		System.out.println(str + " " + c2);

		str = "Persistent";
		c2 = ccc.readUniqueCharacters(str);
		System.out.println(str + " " + c2);

		str = "Hello";
		c2 = c4.readUniqueCharacters(str);
		System.out.println(str + " " + c2);
	}

}
