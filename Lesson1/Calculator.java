

// Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами

class Calculator {
	public static int exponentiation ( int a, int b ){
		int result = 1;
		for ( int i=0; i<b; i++ ){
			result = result * a;
		}
		return result;
	}

	public static void main (String[] args) {
		int a = 11;
		int b = 3;
		char sign = '/';
		int result = 0;
		int wrongSign = 0;

		// check the sign and make result.
		if ( sign == '+' ) {
			result = a + b;
		}
		else if ( sign == '-' ) {
			result = a - b;
		}
		else if ( sign == '*' ) {
			result = a * b;
		}
		else if ( sign == '/' ) {
			result = a / b;
		}
		else if ( sign == '^' ) {
			result = exponentiation( a, b );
		}
		else if ( sign == '%' ) {
			result = a % b;
		}
		else {
			wrongSign = 1;
		}

		// print result if sign is ok
		if ( wrongSign == 0 ) {
			System.out.println( a + "" + sign + "" + b + "=" + result );
		}
		else {
			System.out.println( "Wrong sign entered." );
		}

	}

}
