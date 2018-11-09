package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int guessNumber;
	private Player player1;
	private Player player2;
	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();

	public GuessNumber (Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		int retry = 0;
		int maxRetries = 10;
		guessNumber = rand.nextInt(100);
		System.out.println("Компьютер: Я загадал число от 0 до 100.");
		System.out.println("Подсказонька: " + guessNumber);
		System.out.println("У вас " + maxRetries + " попыток.");

		while (retry < maxRetries) {
			enterNumber(player1, retry);
			player1.setIsWin(checkNumber(player1, retry));
			enterNumber(player2, retry);
			player2.setIsWin(checkNumber(player2, retry));

			if (player1.getIsWin() && player2.getIsWin()) {
				System.out.println("У нас ничья!!! Оба игрока угадали с " + (retry + 1) + " попытки");
				break;
			} else if (player1.getIsWin()) {
				player1.winMessage(guessNumber, retry);
				break;
			} else if (player2.getIsWin()) {
				player2.winMessage(guessNumber, retry);
				break;
			} else {
				if (retry == maxRetries-1) {
					System.out.println("У " + player1.getName() + " закончились попытки");
					System.out.println("У " + player2.getName() + " закончились попытки");
					break;
				} else {
					System.out.println("Никто не угадал. Осталось " + (maxRetries - retry -1) + " попыток.");
				}
			}
			retry ++;
		}
		player1.printGuessedNumbers(retry);
		player2.printGuessedNumbers(retry);
		player1.zeroize(retry);
		player2.zeroize(retry);
	}

	private void enterNumber(Player player, int index) {
		System.out.print(player.getName() + ", введите число: ");
		player.setNumber(index, scan.nextInt());
	}

	private boolean checkNumber(Player player, int index) {
		if (player.getNumber(index) == guessNumber) {
			return true;
		} else {
			return false;
		}
	}
}

