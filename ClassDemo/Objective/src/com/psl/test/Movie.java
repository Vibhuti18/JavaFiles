package com.psl.test;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	String movieName;
	List<String> actors;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public List<String> getActors() {
		return actors;
	}
	public void setActors(List<String> actors) {
		this.actors = actors;
	}

}
