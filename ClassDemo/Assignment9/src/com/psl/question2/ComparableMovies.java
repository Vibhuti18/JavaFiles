package com.psl.question2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparableMovies {

	static List<Movies> list = new ArrayList<Movies>();
	Scanner s = new Scanner(System.in);
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

	@SuppressWarnings("deprecation")
	public List<Movies> createMovieList() {
		// System.out.println("how many objects do you want to add?");
		// int n = s.nextInt();
		// Date date = ;
		Movies m[] = new Movies[5];
		m[0] = new Movies("Simran", "Hindi", "RK", "LK", new Date(9, 12, 2016),
				125);
		m[1] = new Movies("Dhoom", "Hindi", "KK", "VK", new Date(9, 12, 2016),
				130);
		m[2] = new Movies("Inception", "English", "SK", "BK", new Date(9, 12,
				2013), 115);
		m[3] = new Movies("Sairat", "Marathi", "JK", "HK",
				new Date(9, 12, 2014), 155);
		m[4] = new Movies("Deadpool", "English", "WK", "MK", new Date(9, 12,
				2011), 105);

		for (int i = 0; i < 5; i++)
			list.add(m[i]);

		return list;
	}

	public static void sortByLanguage(List<Movies> movieList) {
		Collections.sort(movieList);
		System.out.println("MOvies after sort on Language " + list);

	}

	public static void SortBydirectorMethod(List<Movies> movieList) {

		Collections.sort(movieList, new SortByDirector());
		System.out.println("MOvies after sort on Director " + list);

	}

	public static void sortByDuration(List<Movies> movieList) {
		Collections.sort(movieList, new sortByDuration());
		System.out.println("MOvies after sort on duration " + list);
	}

	public static void SortByLanguageAndReleaseDate(List<Movies> movieList) {
		Collections.sort(movieList, new SortByLanguageAndReleaseDate());
		System.out.println("MOvies after sort on Language And ReleaseDate "
				+ list);
	}

	public static void main(String[] args) {

		ComparableMovies obj = new ComparableMovies();
		list = obj.createMovieList();
		sortByLanguage(list);
		SortBydirectorMethod(list);
		sortByDuration(list);
		SortByLanguageAndReleaseDate(list);

	}

}
