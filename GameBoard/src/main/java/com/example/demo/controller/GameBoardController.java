package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.GameBoardModel;
import com.example.demo.service.IGameBoardService;

@RestController
@RequestMapping("/gameboard")
public class GameBoardController implements IGameBoardController {
	
	
	@Autowired
	IGameBoardService gameBoardService;
	
	private static GameBoardModel gameBoard;

	@Override
	@RequestMapping("/generate/board")
	public GameBoardModel createGameBoard() {
		gameBoard = gameBoardService.generateGameBoard();
		return gameBoard;
	}

}
