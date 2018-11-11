package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите имя первого игрока: ");
		Player player1 = new Player(scan.next());
		System.out.print("Введите имя второго игрока: ");
		Player player2 = new Player(scan.next());
		System.out.print("Введите количество попыток: ");
		int maxAttempts = scan.nextInt();
		GuessNumber game = new GuessNumber(player1, player2, maxAttempts);
		String answer;

		do {
			game.startGame();
			do {
				System.out.print("Хотите сыграть ещё раз? ");
				answer = scan.next();
			} while (!answer.equals("Да") && !answer.equals("Нет"));
		} while (answer.equals("Да"));
	}
}