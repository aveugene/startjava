package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;
class CalculatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите математическое выражение: ");
		String mathExpression = scanner.nextLine();
		String[] mathExpressionArray = mathExpression.split("\\s+");

		Calculator calc = new Calculator();
		calc.setFirstNumber(Integer.parseInt(mathExpressionArray[0]));
		calc.setSign(mathExpressionArray[1].charAt(0));
		calc.setSecondNumber(Integer.parseInt(mathExpressionArray[2]));
		calc.calculate();
	}
}
