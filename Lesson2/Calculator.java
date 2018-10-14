class Calculator {
	private int firstNumber;
	private int secondNumber;
	private char sign;

	public void setFirstNumber(int firstNumber){
		if (firstNumber>=0){
			this.firstNumber = firstNumber;
		}
		else{
			System.out.println("Первое число должно быть целым положительным.");
		}
	}
	public void setSecondNumber(int secondNumber){
		if (secondNumber>=0){
			this.secondNumber = secondNumber;
		}
		else{
			System.out.println("Второе число должно быть целым положительным.");
		}
	}
	public void setSign(char sign){
		this.sign = sign;
	}

	public void calculate (){
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
