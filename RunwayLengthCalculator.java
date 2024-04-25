import java.util.Scanner;

public class RunwayLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter speed and acceleration (separated by comma): ");
        String input = scanner.nextLine();
        
        String[] values = input.split(",");
        double speed = Double.parseDouble(values[0].trim());
        double acceleration = Double.parseDouble(values[1].trim());
        
        double runwayLength = calculateRunwayLength(speed, acceleration);
        
        System.out.printf("The minimum runway length for this airplane is %.3f meters%n", runwayLength);
    }
    
    public static double calculateRunwayLength(double speed, double acceleration) {
        // Calculate minimum runway length
        return Math.pow(speed, 2) / (2 * acceleration);
    }
}