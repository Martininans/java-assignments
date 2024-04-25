import java.util.Scanner;

public class NewLucky1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String prompt = """
                Welcome to martin's Guess game
                Play until you guess right
                """;
        System.out.println(prompt);

        int correct = 777;
        
        while (true) {
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
        }
        scanner.close();
    }
}
