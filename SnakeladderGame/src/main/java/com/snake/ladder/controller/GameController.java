package com.snake.ladder.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snake.ladder.Model.GameBoardModel;
import com.snake.ladder.Model.GameResult;
import com.snake.ladder.Model.Location;
import com.snake.ladder.Model.Player;
import com.snake.ladder.service.IRollingService;

@RestController
@RequestMapping("/snakeandladder")
public class GameController implements IGameController {

	@Autowired
	IRollingService rollingservice;

	@Autowired
	IRetriveGameModel gameModel;

	private static GameBoardModel boardModel;

	private final int initialPosition = 0;
	private int currentPosition = 0;

	private static Map<Integer, Integer> playerPosition = new HashMap<Integer, Integer>(4);
	private static List<Player> players = new ArrayList<>(4);

	
	@PostMapping("/newPlayer")
	public String newPlayer(@RequestBody Player player) {
		boolean added = rollingservice.newPlayer(player);
		if (added) {
			return "New Played added Successfully....!!!!";
		} else {
			return "Sorry, Room Completed or you are already added....!!!!!";
		}

	}
	
	@GetMapping("/GenerateGameBoard")
	public String GenerateGameBoard() {
	 this.setBoardModel(gameModel.GenerateGameBoard());	
	 return "Yeah... GameBoard is ready, Lets play...!!!";
	}
	
		
	
	@GetMapping("/getplayers")
	public List<Player> getAllPlayers(){
		return GameController.getPlayers();
	}

	@GetMapping("/rolldice/playerig/{playerID}/diceface/{diceface}")
	public String rollDice(@PathVariable("playerID") int id, @PathVariable("diceface") int diceFace) {
		
		boolean result = rollingservice.Roll(id, diceFace);
		
		if (result) {
			return "Player " + id + " is Win the match....!!!!!!!";
		} else {
			return "New Position for Player " + id + " : " + playerPosition.get(Integer.valueOf(id));
		}
	}
	

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	public GameBoardModel getBoardModel() {
		return boardModel;
	}

	public void setBoardModel(GameBoardModel boardModel) {
		GameController.boardModel = boardModel;
	}

	public static Map<Integer, Integer> getPlayerPosition() {
		return playerPosition;
	}

	public static void setPlayerPosition(Map<Integer, Integer> playerPosition) {
		GameController.playerPosition = playerPosition;
	}

	public int getInitialPosition() {
		return initialPosition;
	}

	public static List<Player> getPlayers() {
		return players;
	}

	public static void setPlayers(List<Player> players) {
		GameController.players = players;
	}
	

}
