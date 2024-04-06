import java.util.Scanner;

public class PowerCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        int result = calculatePower(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
    }
    
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }
    }
}
