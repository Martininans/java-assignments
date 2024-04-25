public class ReplaceEvenWithZeros {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] resultArray = replaceEvenWithZeros(arr);
        for (int num : resultArray) {
            System.out.print(num + " ");
        }

    }

    public static int[] replaceEvenWithZeros(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] = 0;
            } else {
                result[i] = 1;
            }
        }
        return result;
    }
}
