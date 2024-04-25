import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = scanner.nextDouble();

        double annualInterestRate = 0.0375;
        double monthlyInterestRate = annualInterestRate / 12;

        double accountValue = 0;
        for (int i = 0; i < 6; i++) {
            accountValue = (accountValue + monthlySavingAmount) * (1 + monthlyInterestRate);
        }

        System.out.printf("After the sixth month, the account value is: $%.2f%n", accountValue);
    }
}
