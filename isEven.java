import java.util.Scanner;

public class isEven {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        if (isEven(userInput)) {
            System.out.println(userInput + " is even.");
        } else {
            System.out.println(userInput + " is odd.");
        }
    }
}
