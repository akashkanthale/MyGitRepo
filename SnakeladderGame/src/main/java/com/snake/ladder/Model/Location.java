package com.snake.ladder.Model;

public class Location {
	String city;
	String State;
	String Country;
	long pincode;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public Location(String city, String state, String country, long pincode) {
		super();
		this.city = city;
		State = state;
		Country = country;
		this.pincode = pincode;
	}
	
	
	

}
