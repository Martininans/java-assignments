import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        int factorial = calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}
