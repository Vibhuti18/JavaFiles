package com.psl.test;

import java.util.ArrayList;
import java.util.List;

class Talker
{
	public static void main(String[] args) {
		

		List<String> list = null;
		List<Movie> listOfmovies = new ArrayList<>();
		
		Movie m=null;
		
		m=new Movie();
		m.setMovieName("Jab tak hai jaan");
		list = new ArrayList<String>();
		list.add("Shahrukh khan ");
		list.add("Anushka sharma");
		list.add("Katrina Kaif");
		m.setActors(list);
		
		
		m=new Movie();
		m.setMovieName("befikre");
		list = new ArrayList<String>();
		list.add("ranveer singh");
		list.add("vaani kapoor");
		m.setActors(list);
		listOfmovies.add(m);
		
		m=new Movie();
		m.setMovieName("Rab ne bana di jodi");
		list = new ArrayList<String>();
		list.add("Shahrukh khan ");
		list.add("Amitabh Bacchhan");
		list.add("Anushka Sharma");
		m.setActors(list);
		listOfmovies.add(m);
		
		m=new Movie();
		m.setMovieName("ramleela");
		list = new ArrayList<String>();
		list.add("Ranver singh");
		list.add("deepika padukone");
		m.setActors(list);
		listOfmovies.add(m);
		
		
		for (Movie movie : listOfmovies) {
			
		}
	}
 } 

