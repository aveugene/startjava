package com.startjava.lesson_2_3.game;

public class Player {
	private String name;
	private int number;
	private boolean isWin;

	public Player(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setIsWin(boolean isWin) {
		this.isWin = isWin;
	}

	public boolean getIsWin() {
		return isWin;
	}
}