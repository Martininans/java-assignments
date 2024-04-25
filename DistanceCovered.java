import java.util.Scanner;

public class DistanceCovered {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the initial velocity (meters/second): ");
        double initialVelocity = scanner.nextDouble();

        System.out.print("Enter the time span (seconds): ");
        double timeSpan = scanner.nextDouble();

        System.out.print("Enter the acceleration (meter/second^2): ");
        double acceleration = scanner.nextDouble();

        double distanceCovered = initialVelocity * timeSpan + 0.5 * acceleration * Math.pow(timeSpan, 2);

        System.out.println("The distance covered is: " + distanceCovered + " meters.");

        scanner.close();
    }
}
