import java.util.Scanner;

public class AdditionLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
            
            System.out.print("Do you want to perform the operation again? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

    }
}
