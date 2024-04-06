import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number between 0 and 1000: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter an integer between 0 and 1000.");
            return;
        }
        int sum = 0;
        int originalNumber = number;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits in " + originalNumber + " is: " + sum);

    }
}