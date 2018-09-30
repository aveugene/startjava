// Угадай число:
// компьютер "загадывает" целое число от 0 до 100, которое вам необходимо угадать -=- some int 
// после каждой неудачной попытки выводите подсказки: System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер") -=- if, else if
// если число угадано — System.out.println("Вы угадали!") -=- else
// игра продолжается до тех пор, пока число не будет угадано  -=- while ( true )
class MyFirstGame {
	public static void main (String[] args) {
		int numberToGuess = 75;
		int guess = 80;
		
		// игра продолжается до тех пор, пока число не будет угадано
		while (true) {
			
			// после каждой неудачной попытки выводите подсказки
			if (guess < numberToGuess) {
				System.out.println ("Введенное вами число меньше того, что загадал компьютер");
				guess ++;
			} else if (guess > numberToGuess) {
				System.out.println ("Введенное вами число больше того, что загадал компьютер");
				guess --;
			} else {
				// если число угадано
				System.out.println ("Вы угадали!");
				break;
			}
		}
	}
}