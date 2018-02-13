package com.psl.question2;

import java.util.Comparator;

public class SortByLanguageAndReleaseDate implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub

		int i = o1.language.compareTo(o2.language);

		if (i == 0) {
			return o1.releaseDate.compareTo(o2.releaseDate);
		}
		return o1.language.compareTo(o2.language);
	}

}
