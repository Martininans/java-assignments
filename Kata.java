public class Kata {
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	public static boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int subtract(int a, int b) {
        	int result = a - b;
        	return result >= 0 ? result : -result;
    	}
	public static float divide(int a, int b) {
		float result = (float) a / b;
		result = (int) (result * 100.0) / 100.0f;
        	return result;
	}
	public static int factorOf(int number) {
        	int count = 0;
        	for (int i = 1; i <= number; i++) {
            		if (number % i == 0) {
                	count++;
            		}
       		}
        	return count;
    	}
	public static boolean isSquare(int number) {
        	if (number < 0)
            	return false;

        	for (int i = 0; i * i <= number; i++) {
            		if (i * i == number)
                	return true;
        	}
        	return false;
    	}
	public static boolean isPalindrome(int number) {
        	String numString = String.valueOf(number);
        	if (numString.length() != 5) {
            	return false;
        	}
        
        	for (int i = 0; i < numString.length() / 2; i++) {
            		if (numString.charAt(i) != numString.charAt(numString.length() - 1 - i)) {
                	return false;
            		}
        	}
        
        	return true;
    	}
	 public static long factorialOf(int number) {
        	if (number < 0) {
            		throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        	}

        	long factorial = 1;
		for (int i = 1; i <= number; i++) {
            	factorial *= i;
        	}

        	return factorial;
    	}
}