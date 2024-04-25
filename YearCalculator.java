import java.util.Scanner;

public class YearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        int minutesInYear = 365 * 24 * 60;
        int minutesInDay = 24 * 60;
        int years = minutes / minutesInYear;
        int remainingMinutes = minutes % minutesInYear;
        int days = remainingMinutes / minutesInDay;

        System.out.println("Maximum number of years: " + years);
        System.out.println("Remaining days: " + days);
    }
}
