package com.snake.ladder.controller;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snake.ladder.Model.GameBoardModel;
import com.snake.ladder.Model.Player;


public interface IGameController {
	
	public String newPlayer(Player player);
	
	public String rollDice(int id, int diceFace);
	
	public List<Player> getAllPlayers();

}
