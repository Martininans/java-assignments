import java.util.Scanner;

public class FutureInCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment ammount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = scanner.nextDouble();


        System.out.print("Enter number of years: ");
        double numberOfYears = scanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / 12;
	double futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^ numberOfYears*12;


        System.out.printf("Future value is: $%.2f%n", futureInvestmentValue);
    }
}
