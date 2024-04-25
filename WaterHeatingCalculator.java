import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();
        System.out.print("Enter the initial temperature of water in degrees Celsius: ");
        double initialTemperature = scanner.nextDouble();
        System.out.print("Enter the final temperature of water in degrees Celsius: ");
        double finalTemperature = scanner.nextDouble();

        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed to heat the water is: " + energy + " joules.");
    }
}
