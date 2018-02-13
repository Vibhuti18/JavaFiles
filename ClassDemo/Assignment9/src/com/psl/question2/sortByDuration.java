package com.psl.question2;

import java.util.Comparator;

public class sortByDuration implements Comparator<Movies>{
	
	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		int i=0;
		if(o1.duration > o2.duration)
			i= 1;
		else if (o1.duration<o2.duration) {
			
			i= -1;
			
		}
		else
			i= 0;
		
		return i;
	}

}
