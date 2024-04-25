import java.util.Scanner;

public class BMIApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double heightInInches = input.nextDouble();
        
        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = calculateBMI(weightInKilograms, heightInMeters);
        System.out.println("BMI: " + bmi);

    }

    public static double calculateBMI(double weightInKilograms, double heightInMeters) {
        return weightInKilograms / (heightInMeters * heightInMeters);
    }
}
