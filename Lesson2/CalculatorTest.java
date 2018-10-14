import java.util.Scanner;
class CalculatorTest {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Введите знак математической операции: ");
		char sign = scanner.next().charAt(0);
		System.out.print("Введите второе число: ");
		int secondNumber = scanner.nextInt();

		Calculator calc = new Calculator();
		calc.setFirstNumber(firstNumber);
		calc.setSign(sign);
		calc.setSecondNumber(secondNumber);
		calc.calculate();
	}
}
