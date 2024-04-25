import java.util.Scanner;

public class IntrestCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter balance and interest rate: ");
        double monthlySavingAmount = scanner.nextDouble();

        double annualInterestRate = 3.5;
        double monthlyInterestRate = annualInterestRate / 1200;

        double interest = monthlySavingAmount * monthlyInterestRate;
        System.out.printf("the interest is: %.5f%n", interest);
    }
}
