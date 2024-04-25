import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the exchange rate from USD to Chinese RMB: ");
        double exchangeRate = scanner.nextDouble();

        System.out.println("Enter 0 to convert from USD to Chinese RMB, or 1 to convert from Chinese RMB to USD: ");
        int conversionDirection = scanner.nextInt();

        if (conversionDirection == 0) {
            System.out.print("Enter the amount in USD: ");
            double usdAmount = scanner.nextDouble();
            double rmbAmount = usdAmount * exchangeRate;
            System.out.println("Amount in Chinese RMB: " + rmbAmount);
        } else if (conversionDirection == 1) {
            System.out.print("Enter the amount in Chinese RMB: ");
            double rmbAmount = scanner.nextDouble();
            double usdAmount = rmbAmount / exchangeRate;
            System.out.println("Amount in USD: " + usdAmount);
        } else {
            System.out.println("Invalid input. Please enter 0 or 1.");
        }

        scanner.close();
    }
}
