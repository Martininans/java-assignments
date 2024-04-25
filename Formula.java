import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {

        int C = 50;
        int H = 30;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of D: ");
        int D = scanner.nextInt();

        double Q = Math.sqrt((2 * C * D) / (double) H);

        System.out.println("Value of Q: " + Q);

    }
}
