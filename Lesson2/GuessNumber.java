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
		guessNumber = rand.nextInt(100);
		System.out.println("Компьютер: Я загадал число от 0 до 100.");
		System.out.println("Подсказонька: " + guessNumber);

		while (true) {
			enterNumber(player1);
			player1.setIsWin(checkNumber(player1));
			enterNumber(player2);
			player2.setIsWin(checkNumber(player2));

			if (player1.getIsWin() && player2.getIsWin()) {
				System.out.println("У нас ничья!!!");
				break;
			} else if (player1.getIsWin()) {
				System.out.println("Победил первый игрок!");
				break;
			} else if (player2.getIsWin()) {
				System.out.println("Победил второй игрок!");
				break;
			} else {
				System.out.println("Никто не угадал. Будем играть до победного.");
			}	
		}
	}

	private void enterNumber(Player player) {
		System.out.print(player.getName() + ", введите число: ");
		player.setNumber(scan.nextInt());
	}

	private boolean checkNumber(Player player) {
		if (player.getNumber() == guessNumber) {
			return true;
		} else {
			return false;
		}
	}
}

