package com.psl.question4;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class MapClassClient {

	Map<Integer, City> map = new TreeMap<Integer, City>( new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub

			if(o1>o2)
				return -1;
			else if(o1<o2)
				return 1;
			return 0;
		}
		
	
	});

	public void addElements() {

		City c = new City();
		c.setCityId(004);
		c.setCityName("Pune");
		map.put(c.getCityId(), c);
		c = new City();
		c.setCityId(002);
		c.setCityName("Mumbai");
		map.put(c.getCityId(), c);
		c = new City();
		c.setCityId(001);
		c.setCityName("Nagpur");
		map.put(c.getCityId(), c);
		c = new City();
		c.setCityId(006);
		c.setCityName("Kolhapur");
		map.put(c.getCityId(), c);
		c = new City();
		c.setCityId(003);
		c.setCityName("Aurangabad");
		map.put(c.getCityId(), c);
		c = new City();
		c.setCityId(005);
		c.setCityName("Solapur");
		map.put(c.getCityId(), c);

	}
	
	
	public void sortByVal() {
		
		
		Set<City> set2 = new TreeSet<City>(new Comparator<City>() {
			
			public int compare(City o1, City o2) {
				return o1.getCityName().compareTo(o2.getCityName());
				
			};
		});
		set2.addAll(map.values());
		
		System.out.println(set2);
		
		
				
	}

	public void displayMap() {

		for (Entry<Integer, City> string : map.entrySet()) {
			System.out.println(string.getKey() + " "
					+ string.getValue().toString());
		}

	}

	public void retreiveSpecificValue() {

		int val = 005;
		for (Entry<Integer, City> c : map.entrySet()) {

			if (val<= (c.getKey())) {
				System.out.println(c.getKey());
				break;
			}
		}

		// System.out.println();

	}

	public void retreiveGreater() {

		for (Entry<Integer, City> c : map.entrySet()) {
			if (c.getKey() >= 003)
				System.out.println(c.getKey() + " " + c.getValue().cityName);
		}
	}

	
	public void rangeDisplay() {
		
		for (Entry<Integer, City> c : map.entrySet()) {
			if (c.getKey() >= 002 && c.getKey()<006 )
				System.out.println(c.getKey() + " " + c.getValue().cityName);
		}

		
	}
	public static void main(String[] args) {

		MapClassClient mpc = new MapClassClient();
		mpc.addElements();
		 mpc.displayMap();
		 //mpc.retreiveSpecificValue();

		//mpc.retreiveGreater();
		//mpc.rangeDisplay();
		 
		 mpc.sortByVal();

	}

}
