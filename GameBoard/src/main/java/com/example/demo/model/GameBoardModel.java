package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public class GameBoardModel {
	
	private Map<Integer, Integer> snakePositions = new HashMap<Integer, Integer>();
	private Map<Integer, Integer> ladderPositions = new HashMap<Integer, Integer>();
	
	
	
	public GameBoardModel(Map<Integer, Integer> snakePositions, Map<Integer, Integer> ladderPositions) {
		super();
		this.snakePositions = snakePositions;
		this.ladderPositions = ladderPositions;
	}
	
	
	public Map<Integer, Integer> getSnakePositions() {
		return snakePositions;
	}
	public void setSnakePositions(Map<Integer, Integer> snakePositions) {
		this.snakePositions = snakePositions;
	}
	public Map<Integer, Integer> getLadderPositions() {
		return ladderPositions;
	}
	public void setLadderPositions(Map<Integer, Integer> ladderPositions) {
		this.ladderPositions = ladderPositions;
	}

	
	
	
}
