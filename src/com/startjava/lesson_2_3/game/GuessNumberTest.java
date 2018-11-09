package com.startjava.lesson_2_3.game;

import java.util.Scanner;
public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;

		GuessNumber game = new GuessNumber();
		game.setupGame();
		do {
			game.startGame();
			do {
				System.out.print("Хотите сыграть ещё раз? ");
				answer = scan.next();
			} while (!answer.equals("Да") && !answer.equals("Нет"));
		} while (answer.equals("Да"));
	}
}