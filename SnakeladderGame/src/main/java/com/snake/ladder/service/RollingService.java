package com.snake.ladder.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.snake.ladder.Model.Player;
import com.snake.ladder.controller.GameController;
import com.snake.ladder.controller.IGameController;

@Component
public class RollingService implements IRollingService {
	
	@Autowired
	IPlay play;
	
	@Autowired
	IGameController controller;

	@Override
	public boolean Roll(int id, int diceFace) {
		play.changePosition(GameController.getPlayerPosition(), id, diceFace, ((GameController)controller).getBoardModel());
		boolean result = play.checkWin(GameController.getPlayerPosition(), id);
		return result;
		
	}

	@Override
	public boolean newPlayer(Player player) {
		
		if((!GameController.getPlayerPosition().containsKey(player.getId())) && GameController.getPlayerPosition().size() < 4) {
			(GameController.getPlayers()).add(player);
			GameController.getPlayerPosition().put(player.getId(), ((GameController)controller).getInitialPosition());
			return true;
		}else {
			return false;
		}
		
	}

}
