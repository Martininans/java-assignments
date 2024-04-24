import java.util.Scanner;

public class Taskthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
	int sum = 0;
	
        for (int i = 1; i <= 10; i++) {
		System.out.print("Enter Scores: ");
        	int score = scanner.nextInt();  
 		sum += score;
	}       	
	int average = sum / 10;	
        System.out.println("The sum is " + sum);
	System.out.println("The average is " + average);

    }
}