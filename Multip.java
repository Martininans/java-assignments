public class Multip {
    public static void main(String[] args) {

        int[] array = {9, 9, 3, 1, 6};
        int max = Integer.MIN_VALUE; 
        int result;

        for (int index = 0; index < array.length; index++) {
            for (int j = 0; j < array.length; j++) {
                if (index != j) { 
                    result = array[index] * array[j];
                    if (result > max) {
                        max = result;
                    }
                }
            }
        }

        System.out.print(max);
    }
}
