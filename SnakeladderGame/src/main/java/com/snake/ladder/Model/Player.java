package com.snake.ladder.Model;

import java.util.Map;

public class Player {
	
	int id;
	String Name;
	Location location;
	Map<Integer, String> lastFiveGames;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Map<Integer, String> getLastFiveGames() {
		return lastFiveGames;
	}
	public void setLastFiveGames(Map<Integer, String> lastFiveGames) {
		this.lastFiveGames = lastFiveGames;
	}
	public Player(int id, String name, Location location, Map<Integer, String> lastFiveGames) {
		super();
		this.id = id;
		Name = name;
		this.location = location;
		this.lastFiveGames = lastFiveGames;
	}
	
	
	

}
