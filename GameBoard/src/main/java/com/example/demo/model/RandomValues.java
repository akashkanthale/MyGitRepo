package com.example.demo.model;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RandomValues {
	
	private Random random;

	int start;
	int end;
	
	
	public int getStart() {
		return start;
	}
	private void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	private void setEnd(int end) {
		this.end = end;
	}
	
	
	public RandomValues generateRandomStartEnd() {
		RandomValues randomValues = new RandomValues();
		
		randomValues.setStart(this.getRandom().nextInt(100));
		randomValues.setEnd(this.getRandom().nextInt(100));
		
		return randomValues;
		
	}
	
	public Random getRandom() {
		return new Random();
	}
	
	
	
	

}
