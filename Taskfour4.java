import java.util.Scanner;

public class Taskfour4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
	int sum = 0;
	int sumOfindexes = 0;
	int counter = 0;
        for (int i = 1; i <= 10; i++) {
		System.out.print("Enter Scores: ");
        	int score = scanner.nextInt();  
                sum = score;
		if (i % 2 == 0){
		sumOfindexes += i;
		}
}
	      		
        System.out.println("The sum Of indexes is " + sumOfindexes);
	
    }
}