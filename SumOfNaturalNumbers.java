public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        
        // Iterate from 1 to num and accumulate the sum
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        
        System.out.println("The sum of the first " + num + " natural numbers is: " + sum);
    }
}
