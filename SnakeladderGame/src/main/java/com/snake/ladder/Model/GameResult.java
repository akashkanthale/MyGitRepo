package com.snake.ladder.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum GameResult {
	WIN("WIN"),
	LOOSE("LOOSE"),
	TIE("TIE");

	private String name;
    private String value;

    GameResult(String value) {
        name = name();
        this.value = value;
    }
    
    public String getName() {
        return name;
    }
    
    public String getValue() {
        return value;
    }
}
