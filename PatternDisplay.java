public class PatternDisplay {

    public static void main(String[] args) {

        System.out.println("Pattern 1:");
        pattern1();

        System.out.println("\nPattern 2:");
        pattern2();

        System.out.println("\nPattern 3:");
        pattern3();

        System.out.println("\nPattern 4:");
        pattern4();
    }

    public static void pattern1() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for (int i = 1; i <= 6; i++) {
            
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 6 - (6 - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    
    public static void pattern3() {
        for (int i = 1; i <= 6; i++) {
            
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            
            for (int j = i; j <= 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
   
    public static void pattern4() {
        for (int i = 1; i <= 6; i++) {
         
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 6 - (i - 1); j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
