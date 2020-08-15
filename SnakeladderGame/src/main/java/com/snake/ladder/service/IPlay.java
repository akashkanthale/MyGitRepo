package com.snake.ladder.service;

import java.util.Map;

import com.snake.ladder.Model.GameBoardModel;

public interface IPlay {

	public void changePosition(Map<Integer, Integer> playerPosition, int id, int diceFace, GameBoardModel boardModel);

	public boolean checkWin(Map<Integer, Integer> playerPosition, int id);

}
