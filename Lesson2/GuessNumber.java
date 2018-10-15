import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
	private int guessNumber;
	private Player player1;
	private Player player2;
	private Scanner scan = new Scanner(System.in);

	public void startGame(){
		System.out.print("Введите имя первого игрока: ");
		String player1Name = scan.next();
		System.out.print("Введите имя второго игрока: ");
		String player2Name = scan.next();
		player1 = new Player(player1Name);
		player2 = new Player(player2Name);

		Random rand = new Random();
		guessNumber = rand.nextInt(100);
		System.out.println("Компьютер: Я загадал число от 0 до 100.");
		System.out.println("Подсказонька: " + guessNumber);

		while (true) {
			enterNumber(player1);
			enterNumber(player2);

			boolean guessPlayer1 = checkNumber(player1);
			boolean guessPlayer2 = checkNumber(player2);

			if (guessPlayer1 && guessPlayer2) {
				System.out.println("У нас ничья!!!");
				break;
			} else if (guessPlayer1) {
				System.out.println("Победил первый игрок!");
				break;
			} else if (guessPlayer2) {
				System.out.println("Победил второй игрок!");
				break;
			} else {
				System.out.println("Никто не угадал. Будем играть до победного.");
			}
			
		}
	}

	private void enterNumber(Player player){
		System.out.print(player.getName() + ", введите число: ");
		int number = scan.nextInt();
		player.setNumber(number);
	}

	private boolean checkNumber(Player player){
		if (player.getNumber() == guessNumber) {
			return true;
		} else {
			return false;
		}
	}
}

