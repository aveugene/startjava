package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int guessNumber;
	private Player player1;
	private Player player2;
	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();
	private int maxAttempts;
	private int attempt;

	public GuessNumber (Player player1, Player player2, int maxAttempts) {
		this.player1 = player1;
		this.player2 = player2;
		this.maxAttempts = maxAttempts;
	}

	public void startGame() {
		attempt = 0;
		computerGenerateRandomNumber();
		while (attempt < maxAttempts) {
			playersEnterNumber();

			if (playersCheckBoth()) {
				break;
			} else if (playersCheckOne(player1)) {
				break;
			} else if (playersCheckOne(player2)) {
				break;
			} else {
				if (attempt == maxAttempts-1) {
					playersOutOfAttempts();
					break;
				} else {
					System.out.println("Никто не угадал. Осталось " + (maxAttempts - attempt -1) + " попыток.");
				}
			}
			attempt ++;
		}
		player1.printGuessedNumbers(attempt);
		player2.printGuessedNumbers(attempt);
		player1.zeroize(attempt);
		player2.zeroize(attempt);
	}

	private void computerGenerateRandomNumber() {
		guessNumber = rand.nextInt(100);
		System.out.println("Компьютер: Я загадал число от 0 до 100.");
		System.out.println("Подсказонька: " + guessNumber);
		System.out.println("У вас " + maxAttempts + " попыток.");
	}

	private void playersEnterNumber() {
		enterNumber(player1);
		player1.setIsWin(checkNumber(player1, attempt));
		enterNumber(player2);
		player2.setIsWin(checkNumber(player2, attempt));
	}

	private void enterNumber(Player player) {
		System.out.print(player.getName() + ", введите число: ");
		player.setNumber(attempt, scan.nextInt());
	}

	private boolean checkNumber(Player player, int index) {
		if (player.getNumber(index) == guessNumber) {
			return true;
		} else {
			return false;
		}
	}

	private boolean playersCheckBoth() {
		if (player1.getIsWin() && player2.getIsWin()) {
			System.out.println("У нас ничья!!! Оба игрока угадали с " + (attempt + 1) + " попытки");
			return true;
		}
		return false;
	}

	private boolean playersCheckOne(Player player) {
		if (player.getIsWin()) {
			player.winMessage(guessNumber, attempt);
			return true;
		}
		return false;
	}

	private void playersOutOfAttempts() {
		System.out.println("У " + player1.getName() + " закончились попытки");
		System.out.println("У " + player2.getName() + " закончились попытки");
	}
}