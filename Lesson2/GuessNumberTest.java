import java.util.Scanner;

public class GuessNumberTest{
	public static void main(String[] args) {
		GuessNumber game = new GuessNumber();
		Scanner scan = new Scanner(System.in);
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