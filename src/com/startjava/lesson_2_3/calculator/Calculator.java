package com.startjava.lesson_2_3.calculator;

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
		switch (sign){
			case '+':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber + secondNumber));
				break;
			case '-':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber - secondNumber));
				break;
			case '*':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber * secondNumber));
				break;
			case '/':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber / secondNumber));
				break;
			case '^':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + raiseToPower(firstNumber, secondNumber));
				break;
			case '%':
				System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber % secondNumber));
				break;
			default:
				System.out.println("The operation " + sign + " is invalid.");
		}
	}
	
	private int raiseToPower(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}


}
