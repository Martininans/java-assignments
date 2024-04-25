import java.util.Scanner;
public class Lucky{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter Your Lucky Number: ");
	int guess = scanner.nextInt();
	int correct = 777;

	if (guess == correct) {
		System.out.println("Correct !!!");
} else if (guess < correct) {
		System.out.println("Number too low");
} else {
	System.out.println("Number too high");	
}
}
}