import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        while (true) {
            System.out.println("Enter a number (enter 0 to stop): ");
            double num = scanner.nextDouble();

            if (num == 0) {
                break;
            } else if (num > 0) {
                positives++;
            } else {
                negatives++;
            }
        }

        System.out.println("Count of positive numbers: " + positives);
        System.out.println("Count of negative numbers: " + negatives);
        System.out.println("Count of zeros: " + zeros);
    }
}
