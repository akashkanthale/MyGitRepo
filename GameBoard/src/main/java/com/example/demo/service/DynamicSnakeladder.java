package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.demo.model.RandomValues;

@Component
public class DynamicSnakeladder implements IDynamicSnakeLadder {

	
	@Autowired
	private RandomValues randomValues;
	
	private int start;
	private int end;

	@Override
	public Map<Integer, Integer> DynamicLadderPositionGenerator() {
		int finish = 0;
		Map<Integer, Integer> ladderPositions = new HashMap<Integer, Integer>();
		while( finish  < 10 ){
			RandomValues values= randomValues.generateRandomStartEnd();
			if(values.getStart() > values.getEnd() && values.getStart() != 0 && values.getEnd() != 0 ) {
				start = values.getEnd();
				end = values.getStart();
				ladderPositions.put(Integer.valueOf(start), Integer.valueOf(end));
				finish++;
			}
		}
		
		return ladderPositions;
	}

	@Override
	public Map<Integer, Integer> DynamicSnakePositionGenerator() {
		int finish = 0;
		Map<Integer, Integer> snakePositions = new HashMap<Integer, Integer>();
		while( finish  < 10 ){
			RandomValues values= randomValues.generateRandomStartEnd();
			if(values.getStart() > values.getEnd() && values.getStart() != 0 && values.getEnd() != 0 ) {
				end = values.getEnd();
				start = values.getStart();
				snakePositions.put(Integer.valueOf(start), Integer.valueOf(end));
				finish++;
			}
		}
		
		return snakePositions;
	}
	
	@Bean
	public RandomValues getRandomvalues() {
		return new RandomValues();
	}
	
}
