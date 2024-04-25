import java.util.Scanner;

public class NewLucky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String prompt = """
                Welcome to martin's Guess game
                How many times do you want to guess?
                """;

        System.out.print(prompt);

        int choice;
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        int counter = choice;
        int correct = 777;

        while (counter > 0) {
            System.out.print("Enter Your Lucky Number: ");
            int guess = scanner.nextInt();

            if (guess == correct) {
                System.out.println("Correct !!!");
                break;
            } else if (guess < correct) {
                System.out.println("Number too low");
            } else {
                System.out.println("Number too high");
            }
            counter--;
        }

        if (counter == 0) {
            System.out.println("Out of guesses. The correct number was: " + correct);
        }

        scanner.close();
    }
}
