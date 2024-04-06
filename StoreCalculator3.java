import java.util.Scanner;

public class StoreCalculator3 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Welcome to E-Store");
        System.out.println("Please Enter Name:");
        String customerName = userInput.nextLine();

        System.out.println("Welcome to E-Store: " + customerName);
        System.out.print("Please Enter interestRate:");
        double rate = userInput.nextDouble();

        int counter = 1;
        int bonusCondition = 200;
        double interestRate = rate / 100;
        int initialPrice = 0;
        double priceAfterDiscount = 0;
        int costOfItem;

        while (true) {
            System.out.print("Please Enter cost for Item" + counter + " (enter -1 to finish): ");
            costOfItem = userInput.nextInt();
            if (costOfItem == -1) {
                break;
            }
            initialPrice += costOfItem;
            counter++;
        }

        double discountPrice = initialPrice * 0.10;

        if (initialPrice >= bonusCondition) {
            priceAfterDiscount = initialPrice - discountPrice;
            System.out.printf("Customer Name: %s%nOriginal cost: %d%nDiscounted cost: %.2f%nThanks for using E-store!!!",
                    customerName, initialPrice, priceAfterDiscount);

        } else {
            System.out.println("Discounted cost: 0 (no discount)");
        }
    }
}
