import java.util.Scanner;

public class TripCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double efficiency = scanner.nextDouble();

        System.out.print("Enter price per gallon ($): ");
        double pricePerGallon = scanner.nextDouble();

        double totalCost = (distance / efficiency) * pricePerGallon;

        System.out.printf("The cost of driving is $%.2f%n", totalCost);
    }
}
