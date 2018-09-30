// Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами
class Calculator {
	public static void main (String[] args) {
		int firstNumber = 11;
		int secondNumber = 3;
		char sign = '^';
		int result = 0;
		int invalidSign = 0;
		// check the sign and make result.
		if (sign == '+') {
			result = firstNumber + secondNumber;
		} else if (sign == '-') {
			result = firstNumber - secondNumber;
		} else if (sign == '*') {
			result = firstNumber * secondNumber;
		} else if (sign == '/') {
			result = firstNumber / secondNumber;
		} else if (sign == '^') {
			result = raiseToPower(firstNumber, secondNumber);
		} else if (sign == '%') {
			result = firstNumber % secondNumber;
		} else {
			invalidSign = 1;
		}
		// print result if sign is ok
		if (invalidSign == 0) {
			System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + result);
		} else {
			System.out.println("The operation " + sign + " is invalid.");
		}
	}
	public static int raiseToPower (int base, int exponent){
		int result = 1;
		for (int i = 0; i < exponent; i++){
			result = result * base;
		}
		return result;
	}


}
