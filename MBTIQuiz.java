import java.util.Scanner;

public class MBTIQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the MBTI Personality Test!");
        System.out.println("For each question, please enter your response:");
        System.out.println("A - Agree    B - Disagree");

        char[] responses = new char[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Question " + (i + 1) + ":");
            char response;
            do {
                System.out.print("Your response (A/B): ");
                response = scanner.nextLine().toUpperCase().charAt(0);
            } while (response != 'A' && response != 'B');

            responses[i] = response;
        }

        System.out.println("\nThank you for completing the MBTI test!");
        System.out.println("Your responses:");

        for (int i = 0; i < 20; i++) {
            System.out.printf("Question %d: %c%n", (i + 1), responses[i]);
        }

        char personalityTrait = calculatePersonalityTrait(responses);
        System.out.println("\nYour Personality Trait: " + personalityTrait);
    }

    public static char calculatePersonalityTrait(char[] responses) {
        int agreeCount = 0;
        int disagreeCount = 0;

        for (char response : responses) {
            if (response == 'A') {
                agreeCount++;
            } else {
                disagreeCount++;
            }
        }

        if (agreeCount >= disagreeCount) {
            return 'I';
        } else {
            return 'E';
        }
    }
}
