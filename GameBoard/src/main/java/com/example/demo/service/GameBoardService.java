package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.GameBoardModel;

@Component
public class GameBoardService implements IGameBoardService {
	
	@Autowired
	IDynamicSnakeLadder snakeLadder;

	@Override
	public GameBoardModel generateGameBoard() {
		
		return new GameBoardModel(snakeLadder.DynamicSnakePositionGenerator(), snakeLadder.DynamicLadderPositionGenerator());
	}

}
