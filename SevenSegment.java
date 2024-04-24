public class SevenSegment {

    private static final String[] SEGMENT_PATTERNS = {
            "1111110",
            "0110000",
            "1101101",
            "1111001",
            "0110011",
            "1011011",
            "1011111",
            "1110000",
            "1111111",
            "1111011",
            "1110111",
            "0011111",
            "1001110",
            "0111101",
            "1001111",
            "1000111",
            "1111011",
            "0110111",
            "0110000",
            "0111000",
            "1000110",
            "0001110",
            "0010101",
            "0110111",
            "1111110",
            "1100111",
            "1101100",
            "0000101",
            "1011011",
            "0001111",
            "0111110",
            "0011110",
            "1010101",
            "0110111",
            "0111011",
            "1101101" 
    };

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
                System.out.print("***");
            } else {
                System.out.print("   ");
            }
            if (i == 2 || i == 4) {
                System.out.print("\n");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < characters.length(); i++) {
            char character = characters.charAt(i);
            System.out.println("Displaying character: " + character);
            displayCharacter(character);
            System.out.println();
        }
    }
}
