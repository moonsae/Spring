package com.acorn.test;

import lombok.Data;

@Data
public class Movie {

	String title;
	int runTime;
	String genre;
	
	public Movie(String title, int runTime, String genre) {
		this.title = title;
		this.runTime = runTime;
		this.genre = genre;
	}
}