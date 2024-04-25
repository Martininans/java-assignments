public class ReplaceEvenWithTrue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean[] resultArray = replaceEvenWithTrue(arr);
        for (boolean bool : resultArray) {
            System.out.print(bool + " ");
        }
    }

    public static boolean[] replaceEvenWithTrue(int[] arr) {
        boolean[] result = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        return result;
    }
}
