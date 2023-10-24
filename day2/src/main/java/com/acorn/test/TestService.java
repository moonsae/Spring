package com.acorn.test;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class TestService {
	public ArrayList<String> getDan(int dan){
		ArrayList<String> danList = new ArrayList<>();
		for(int i=1; i<=9; i++) {
			danList.add(dan+"*"+i+"="+dan*i);
		}
		return danList;
	}
	public ArrayList<Movie> getMovieList(){
		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("30일",119,"코미디"));
		movieList.add(new Movie("1947 보스톤",108,"드라마"));
		movieList.add(new Movie("거미집",132,"코미디"));
		
		return movieList;
	}
	
	
}
