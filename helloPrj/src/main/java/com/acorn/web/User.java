package com.acorn.web;


public class User {

	String id;
	String pw;
	public User() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
    
	
	
}
