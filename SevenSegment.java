public class SevenSegment {

    // Define patterns for each alphanumeric character and digit from 0 to 9
    private static final String[] SEGMENT_PATTERNS = {
            "1111110", // 0
            "0110000", // 1
            "1101101", // 2
            "1111001", // 3
            "0110011", // 4
            "1011011", // 5
            "1011111", // 6
            "1110000", // 7
            "1111111", // 8
            "1111011", // 9
            "1110111", // A
            "0011111", // B
            "1001110", // C
            "0111101", // D
            "1001111", // E
            "1000111", // F
            "1111011", // G
            "0110111", // H
            "0110000", // I
            "0111000", // J
            "1000110", // K
            "0001110", // L
            "0010101", // M
            "0110111", // N
            "1111110", // O
            "1100111", // P
            "1101100", // Q
            "0000101", // R
            "1011011", // S
            "0001111", // T
            "0111110", // U
            "0011110", // V
            "1010101", // W
            "0110111", // X
            "0111011", // Y
            "1101101"  // Z
    };

    // Method to display a character on the 7-segment display
    public static void displayCharacter(char character) {
        int index;
        if (Character.isDigit(character)) {
            index = character - '0';
        } else if (Character.isLetter(character)) {
            index = Character.toUpperCase(character) - 'A' + 10;
        } else {
            System.out.println("Invalid character!");
            return;
        }

        String pattern = SEGMENT_PATTERNS[index];
        for (int i = 0; i < 7; i++) {
            if (pattern.charAt(i) == '1') {
                System.out.print("###"); // Displaying segments as ###
            } else {
                System.out.print("   "); // Empty segment
            }
            if (i == 2 || i == 4) {
                System.out.print("\n"); // Newline for better visualization
            }
        }
        System.out.println(); // Newline after displaying the character
    }

    // Main method to test the display
    public static void main(String[] args) {
        // Test displaying alphanumeric characters and digits
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < characters.length(); i++) {
            char character = characters.charAt(i);
            System.out.println("Displaying character: " + character);
            displayCharacter(character);
            System.out.println(); // Adding an extra line for clarity
        }
    }
}
