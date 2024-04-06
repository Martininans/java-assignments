import java.util.Scanner;

public class StoreCalculator6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to E-Store:");
        System.out.print("Please enter Customer Name: ");
        String customerName = scanner.nextLine();

        double totalCost = 0;

        System.out.println("Enter items and their costs:");

        for (int itemCount = 1; itemCount <= 3; itemCount++) {
            System.out.printf("What is the name of item %d: ", itemCount);
            String itemName = scanner.nextLine();
            System.out.print("How much is it: ");
            double itemCost = Double.parseDouble(scanner.nextLine());
            totalCost += itemCost;
        }

        if (totalCost >= 200) {
            totalCost -= (totalCost * 0.10);
        }

        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("\nTotal item\tcost");
       
        for (int itemCount = 1; itemCount <= 3; itemCount++) {
            System.out.printf("Item %d\t\t\t%.2f%n", itemCount, totalCost / 3);
        }

        System.out.printf("%nTotal cost: %.2f%n", totalCost);
        System.out.printf("Discounted cost: %.2f%n", totalCost);
        System.out.println("Thanks for your patronage!");
    }
}
