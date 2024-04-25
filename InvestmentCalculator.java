import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = calculateInvestmentValue(investmentAmount, annualInterestRate, years);

        // Apply Math.ceil() to round up to the nearest cent
        futureValue = Math.ceil(futureValue * 100) / 100;

        System.out.println("Future investment value: " + String.format("%.3f", futureValue));
    }

    public static double calculateInvestmentValue(double investmentAmount, double annualInterestRate, int years) {
        double futureValue = investmentAmount * Math.pow((1 + annualInterestRate / 100), years);
        return futureValue;
    }
}
