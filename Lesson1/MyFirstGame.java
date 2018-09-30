class MyFirstGame {
	public static void main (String[] args) {
		int numberToGuess = 75;
		int guess = 80;
		
		while (true) {
			if (guess < numberToGuess) {
				System.out.println ("Введенное вами число меньше того, что загадал компьютер");
				guess ++;
			} else if (guess > numberToGuess) {
				System.out.println ("Введенное вами число больше того, что загадал компьютер");
				guess --;
			} else {
				System.out.println ("Вы угадали!");
				break;
			}
		}
	}
}