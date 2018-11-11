package com.startjava.lesson_2_3_4.calculator;

class Calculator {
	private int firstNumber;
	private int secondNumber;
	private char sign;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public void calculate() {
		switch (sign) {
			case '+':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + Math.addExact(firstNumber, secondNumber));
				break;
			case '-':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + Math.subtractExact(firstNumber, secondNumber));
				break;
			case '*':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + Math.multiplyExact(firstNumber, secondNumber));
				break;
			case '/':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + Math.floorDiv(firstNumber, secondNumber));
				break;
			case '^':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (int) Math.pow(firstNumber, secondNumber));
				break;
			case '%':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber % secondNumber));
				break;
			default:
				System.out.println("The operation " + sign + " is invalid.");
		}
	}
}