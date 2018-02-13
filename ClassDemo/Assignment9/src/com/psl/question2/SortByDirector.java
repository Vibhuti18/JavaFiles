package com.psl.question2;

import java.util.Comparator;

public class SortByDirector implements Comparator<Movies> {
	
	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.director.compareTo(o2.director);
	}

}
