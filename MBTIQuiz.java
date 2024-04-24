import java.util.*;

public class MBTIQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"Complex and novel ideas excite you more than simple and straightforward ones.",
                "You usually feel more persuaded by what resonates emotionally with you than by factual arguments.",
                "Your living and working spaces are clean and organized.",
                "You usually stay calm, even under a lot of pressure.",
                "You find the idea of networking or promoting yourself to strangers very daunting.",
                "You prioritize and plan tasks effectively, often completing them well before the deadline.",
                "People’s stories and emotions speak louder to you than numbers or data.",
                "You like to use organizing tools like schedules and lists.",
                "Even a small mistake can cause you to doubt your overall abilities and knowledge.",
                "You feel comfortable just walking up to someone you find interesting and striking up a conversation.",
                "You are not too interested in discussions about various interpretations of creative works.",
                "You prioritize facts over people’s feelings when determining a course of action.",
                "You often allow the day to unfold without any schedule at all.",
                "You rarely worry about whether you make a good impression on people you meet.",
                "You enjoy participating in team-based activities.",
                "You enjoy experimenting with new and untested approaches.",
                "You prioritize being sensitive over being completely honest.",
                "You actively seek out new experiences and knowledge areas to explore.",
                "You are prone to worrying that things will take a turn for the worse.",
                "You enjoy solitary hobbies or activities more than group ones.",
                "You cannot imagine yourself writing fictional stories for a living.",
                "You favor efficiency in decisions, even if it means disregarding some emotional aspects."};
        System.out.println("Welcome to the MBTI Personality Test!");
        System.out.println("For each question, please enter your response:");
        System.out.println("A - Agree    B - Disagree");

        Random rand = new Random();
        int totalQuestions = questions.length;
        char[] responses = new char[totalQuestions];
        List<Integer> askedIndices = new ArrayList<>();
        char response;
        for (int i = 0; i < totalQuestions; i++) {
            int randomIndex;
            do {
                randomIndex = rand.nextInt(totalQuestions);
            } while (askedIndices.contains(randomIndex));
            askedIndices.add(randomIndex);

            System.out.println(questions[randomIndex] + " Your response (A/B): ");
            do {
                response = scanner.nextLine().toUpperCase().charAt(0);
            } while (response != 'A' && response != 'B');

            responses[randomIndex] = response;
        }

        System.out.println("\nThank you for completing the MBTI test!");
        System.out.println("Your responses:");

        for (int i = 0; i < totalQuestions; i++) {
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
