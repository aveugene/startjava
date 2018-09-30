class MyFirstGame {
	public static void main(String[] args) {
		int numberToGuess = 75;
		int guessNumber = 80;
		
		while (true) {
			if (guessNumber < numberToGuess) {
				System.out.println ("Введенное вами число меньше того, что загадал компьютер");
				guessNumber++;
			} else if (guessNumber > numberToGuess) {
				System.out.println ("Введенное вами число больше того, что загадал компьютер");
				guessNumber--;
			} else {
				System.out.println ("Вы угадали!");
				break;
			}
		}
	}
}