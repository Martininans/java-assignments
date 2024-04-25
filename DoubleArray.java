import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        int[] inputArray = {4, 5, 8};
        int[] outputArray = doubleLengthArray(inputArray);
        System.out.println(Arrays.toString(outputArray));
    }

    public static int[] doubleLengthArray(int[] inputArray) {
        int[] doubledArray = new int[inputArray.length * 2];
        for (int i = 0; i < inputArray.length; i++) {
            doubledArray[i] = inputArray[i];
            doubledArray[i + inputArray.length] = inputArray[i] * 2;
        }
        return doubledArray;
    }
}
