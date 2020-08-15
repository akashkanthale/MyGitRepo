package com.snake.ladder.service;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.snake.ladder.Model.GameBoardModel;

@Component
public class Play implements IPlay {

	@Override
	public void changePosition(Map<Integer, Integer> playerPosition, int id, int diceFace, GameBoardModel boardModel) {
		int oldPosition = playerPosition.get(Integer.valueOf(id));
		int newPosition = generateNewPosition(oldPosition, diceFace);
		newPosition = checkForLadderOpportunity(boardModel.getLadderPositions() ,Integer.valueOf(newPosition));
		newPosition = checkForSnakebadLuck(boardModel.getSnakePositions() ,Integer.valueOf(newPosition));
		
		
		playerPosition.put(Integer.valueOf(id), Integer.valueOf(newPosition));
		
	}

	private int generateNewPosition(int oldPosition, int diceFace) {
		if(oldPosition == 0) {
			if(diceFace == 1) {
				return 1;
			}else {
				return 0;
			}
		}else {
			if((oldPosition + diceFace)>100)
			{
				return oldPosition;
			}else {
				return oldPosition + diceFace;
			}
		}
	}

	@Override
	public boolean checkWin(Map<Integer, Integer> playerPosition, int id) {
		int currentPosition = playerPosition.get(Integer.valueOf(id));
		if(currentPosition == 100) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	private Integer checkForLadderOpportunity(Map<Integer, Integer> ladderPositions, Integer newPosition) {
		
		Set<Entry<Integer, Integer>> ladderStartPosition = ladderPositions.entrySet();
		if(ladderStartPosition.contains(newPosition)) {
			return ladderPositions.get(Integer.valueOf(newPosition));
		}else {
			return newPosition;
		}
		
		
	}
	
	private int checkForSnakebadLuck(Map<Integer, Integer> snakePositions, Integer newPosition) {
		Set<Entry<Integer, Integer>> snakeStartPosition = snakePositions.entrySet();
		if(snakeStartPosition.contains(newPosition)) {
			return snakePositions.get(Integer.valueOf(newPosition));
		}else {
			return newPosition;
		}
	}
}
