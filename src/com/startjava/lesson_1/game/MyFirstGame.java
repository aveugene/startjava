package com.startjava.lesson_1.game;

class MyFirstGame {
	public static void main(String[] args) {
		int guessNumber = 75;
		int userNumber = 80;
		
		while (true) {
			if (userNumber < guessNumber) {
				System.out.println ("Введенное вами число меньше того, что загадал компьютер");
				userNumber++;
			} else if (userNumber > guessNumber) {
				System.out.println ("Введенное вами число больше того, что загадал компьютер");
				userNumber--;
			} else {
				System.out.println ("Вы угадали!");
				break;
			}
		}
	}
}