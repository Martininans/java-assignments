import java.util.Scanner;

public class ResultSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to zero
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        // Input the 10 exam results, and count passes and failures
        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = scanner.nextInt();

            if (result == 1) {
                passes = passes + 1;
            } else {
                failures = failures + 1;
            }
            studentCounter = studentCounter + 1;
        }
        scanner.close(); // Close the scanner object
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
