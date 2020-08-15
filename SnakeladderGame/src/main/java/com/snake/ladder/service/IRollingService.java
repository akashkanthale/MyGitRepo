package com.snake.ladder.service;


import com.snake.ladder.Model.Player;

public interface IRollingService {
	
	public boolean newPlayer(Player player);

	public boolean Roll(int id, int diceFace);

}
