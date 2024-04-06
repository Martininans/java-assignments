import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double smallest = 0;
        double largest = 0;
        boolean initial = true;

        System.out.println("Enter numbers (enter any non-numeric value to stop):");

        while (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            
            if (initial) {
                smallest = num;
                largest = num;
                initial = false;
            } else {
                if (num < smallest) {
                    smallest = num;
                }
                if (num > largest) {
                    largest = num;
                }
            }
        }

        if (initial) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Largest number entered: " + largest);
        }

    }
}
