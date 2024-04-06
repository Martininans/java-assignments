import java.util.Scanner;

public class AsterisksDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter five numbers between 1 and 30:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            
            if (number < 1 || number > 30) {
                System.out.println("Please enter a number between 1 and 30.");
                i--;
                continue;
            }
            
            displayAsterisks(number);
        }
        
    }
    
    public static void displayAsterisks(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
