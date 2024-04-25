import java.util.Scanner;

public class SquareMeterConverter {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number in square meters: ");
        
        double numberInSquareMeter = scanner.nextDouble();
        
        double constantNumberInSquareMeter = 0.3025;
        
        double numberInPings = numberInSquareMeter * constantNumberInSquareMeter;
        
        System.out.println(numberInSquareMeter + " square meters is equal to " + numberInPings + " pings.");
        
        scanner.close();
    }
}
