import java.util.Scanner;

public class SevenSegment {

    private static final String[][] SEGMENT_PATTERNS = {
            {" _ ", "| |", "|_|"},

            {"   ", "  |", "  |"},

            {" _ ", " _|", "|_ "},

            {" _ ", " _|", " _|"},

            {"   ", "|_|", "  |"},

            {" _ ", "|_ ", " _|"},

            {" _ ", "|_ ", "|_|"},

            {" _ ", "  |", "  |"},

            {" _ ", "|_|", "|_|"},

            {" _ ", "|_|", " _|"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        int decimalValue = convertToDecimal(binaryNumber);
        displayNumber(decimalValue);
    }

    public static int convertToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

    public static void displayNumber(int number) {
        String numberStr = String.valueOf(number);
        for (int i = 0; i < 3; i++) {
            StringBuilder line = new StringBuilder();
            for (char digit : numberStr.toCharArray()) {
                int digitValue = Character.getNumericValue(digit);
                line.append(SEGMENT_PATTERNS[digitValue][i]).append(" ");
            }
            System.out.println(line);
        }
    }
}
