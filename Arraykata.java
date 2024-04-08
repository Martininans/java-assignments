public class Arraykata{
	 public static int maximumIn(int[] arr) {
        	if (arr.length == 0) {
            		throw new IllegalArgumentException("Array must not be empty");
        		}
		int max = arr[0];
        	for (int i = 1; i < arr.length; i++) {
            	if (arr[i] > max) {
                	max = arr[i];
            		}
        	}
		return max;
    	}
	public static int minimumIn(int[] arr) {
        	if (arr.length == 0) {
            		throw new IllegalArgumentException("Array must not be empty");
        		}
        	int min = arr[0];
        	for (int i = 1; i < arr.length; i++) {
            	if (arr[i] < min) {
                	min = arr[i];
            		}
        	}
        	return min;
    	}
	public static int sumOf(int[] arr) {
        	int sum = 0;
        	for (int num : arr) {
            	sum += num;
        	}
        	return sum;
    	}
	 public static int sumOfEvenNumbersIn(int[] arr) {
        	int sum = 0;
        	for (int num : arr) {
            		if (num % 2 == 0) {
                		sum += num;
            		}
        	}
        	return sum;
    	}
	public static int sumOfOddNumbersIn(int[] arr) {
        	int sum = 0;
        	for (int num : arr) {
            		if (num % 2 != 0) {
                		sum += num;
            		}
        	}
       		return sum;
    	}
	public static int[] maximumAndMinimumNumberOf(int[] arr) {
        	if (arr.length == 0) {
            		throw new IllegalArgumentException("Array must not be empty");
        	}
        	int max = arr[0];
        	int min = arr[0];
        	for (int i = 1; i < arr.length; i++) {
            		if (arr[i] > max) {
                		max = arr[i];
            		}
            		if (arr[i] < min) {
                		min = arr[i];
            		}
        	}
        	return new int[]{max, min};
    	}
	public static int noOfOddNumbersIn(int[] arr) {
        	int count = 0;
        	for (int num : arr) {
            		if (num % 2 != 0) {
                		count++;
            		}
        	}
        	return count;
    	}
	public static int noOfENumbersIn(int[] arr) {
        	int count = 0;
        	for (int num : arr) {
            		if (num % 2 == 0) {
                		count++;
            		}
        	}
        	return count;
    	}
	public static int[] evenNumbersIn(int[] arr) {
        	ArrayList<Integer> evenList = new ArrayList<>();
        	for (int num : arr) {
            		if (num % 2 == 0) {
                		evenList.add(num);
            		}
        	}
        	int[] evenArray = new int[evenList.size()];
        	for (int i = 0; i < evenList.size(); i++) {
            		evenArray[i] = evenList.get(i);
        	}
        	return evenArray;
    	}
	public static int[] oddNumbersIn(int[] arr) {
        	ArrayList<Integer> oddList = new ArrayList<>();
        	for (int num : arr) {
            		if (num % 2 != 0) {
                		oddList.add(num);
            		}
        	}
        	int[] oddArray = new int[oddList.size()];
        	for (int i = 0; i < oddList.size(); i++) {
            		oddArray[i] = oddList.get(i);
        	}
        	return oddArray;
	}
	public static int[] squareNumbersIn(int[] arr) {
        	int[] squaredArray = new int[arr.length];

        	for (int i = 0; i < arr.length; i++) {
            		squaredArray[i] = arr[i] * arr[i];
        	}
        	return squaredArray;
    	}
}