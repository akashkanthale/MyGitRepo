package com.snake.ladder.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snake.ladder.Model.GameBoardModel;

@FeignClient(name = "GameBoard", url = "http://localhost:9081/gameboard")
public interface IRetriveGameModel {
	
	@RequestMapping(value = "/generate/board")
	public GameBoardModel GenerateGameBoard();

}
