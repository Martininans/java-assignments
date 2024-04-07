import java.util.Scanner;

public class StoreCalculatore4 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to E-Store");
        System.out.println("Please Enter Name:");
        String customerName = userInput.nextLine();

        System.out.println("Welcome to E-Store: " + customerName);
        System.out.print("Please Enter the number of item purchased:");
        int numberOfItem = userInput.nextInt();
        System.out.print("Please Enter interestRate:");
        double rate = userInput.nextInt();

        int bonusCondition = 200;
        double interestRate = rate / 100;
        int initialPrice = 0;
        double priceAfterDiscount;

        for (int counter = 1; counter <= numberOfItem; counter++) {
            System.out.print("Please Enter cost for Item" + counter + ": ");
            int costOfItem = userInput.nextInt();
            initialPrice += costOfItem;
        }

        double discountPrice = initialPrice * 0.10;

        if (initialPrice >= bonusCondition) {
            priceAfterDiscount = initialPrice - discountPrice;
            System.out.printf("Customer Name: %s%nOriginal cost:%d%nDiscounted cost:%.2f%nThanks for using E-store!!!",
                    customerName, initialPrice, priceAfterDiscount);

        } else {
            System.out.printf("Original cost: %d%nDiscounted cost: 0 (no discount)%nThanks for your patronage!", initialPrice);
        }
    }
}
