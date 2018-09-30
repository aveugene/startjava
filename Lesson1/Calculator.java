// Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами
class Calculator {
	public static void main (String[] args) {
		int firstNumber = 11;
		int secondNumber = 3;
		char sign = '%';
		
		// check the sign and make result.
		if (sign == '+') {
			System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber + secondNumber));
		} else if (sign == '-') {
			System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber - secondNumber));
		} else if (sign == '*') {
			System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber * secondNumber));
		} else if (sign == '/') {
			System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber / secondNumber));
		} else if (sign == '^') {
			System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + raiseToPower(firstNumber, secondNumber));
		} else if (sign == '%') {
			System.out.println(firstNumber + "" + sign + "" + secondNumber + "=" + (firstNumber % secondNumber));
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
