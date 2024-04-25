import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score1 = scanner.nextInt();

	System.out.print("Enter score: ");
        int score2 = scanner.nextInt();

	System.out.print("Enter score: ");
        int score3 = scanner.nextInt();

        int sum = score1 + score2 + score3;
	
	
	if (sum <= 49) {
	System.out.printf("Student failed by: %d%n", sum);} else{System.out.printf("Studend Pass by: %d%n", sum);}
}
}