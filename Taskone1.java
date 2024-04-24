import java.util.Scanner;

public class Taskone1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
	int sum = 0;
	
        for (int i = 1; i <= 10; i++) {
		System.out.print("Enter Scores: ");
        	int score = scanner.nextInt();  
 		sum += score;
	}       		
	System.out.println("The sum is " + sum);

    }
}