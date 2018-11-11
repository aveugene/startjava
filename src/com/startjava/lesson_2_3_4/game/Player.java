package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private boolean isWin;
	private int[] guessedNumbers = new int[10];


	public Player(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setIsWin(boolean isWin) {
		this.isWin = isWin;
	}

	public boolean getIsWin() {
		return isWin;
	}

	public void setNumber(int index, int number) {
		this.guessedNumbers[index] = number;
	}

	public int getNumber(int index) {
		return guessedNumbers[index];
	}

	public void printGuessedNumbers(int newLength) {
		int[] guessedNumbersToPrint = Arrays.copyOf(guessedNumbers, newLength+1);
		System.out.println("Названные " + name + " числа: " + printArrayInLine(guessedNumbersToPrint));
	}

	private StringBuilder printArrayInLine(int[] arrayToPrint) {
		StringBuilder line = new StringBuilder("");
		for (int number : arrayToPrint) {
			line.append(number + " ");
		}
		return line;
	}

	public void winMessage(int guessNumber, int attempt) {
		System.out.println("Игрок " + name + " угадал число " + guessNumber + " с " + (attempt + 1) + " попытки");
	}

	public void zeroize(int index) {
		Arrays.fill(guessedNumbers,0,index+1,0);
	}
}