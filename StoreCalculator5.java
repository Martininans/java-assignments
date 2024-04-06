import java.util.Scanner;

public class StoreCalculator5 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to E-Store");
        System.out.println("Please Enter Name:");
        String customerName = userInput.nextLine();

        System.out.println("Welcome to E-Store: " + customerName);
        System.out.print("Please Enter the number of item purchased:");
        int numberOfItem = userInput.nextInt();
        System.out.print("Please Enter percentage Discount:");
        double rate = userInput.nextInt();

        int bonusCondition = 200;
        double interestRate = rate / 100;
        int initialPrice = 0;
        double priceAfterDiscount;
        int counter = 1;

        do {
            System.out.print("Please Enter cost for Item" + counter + " " + "or -1 to quit:");
            int costOfItem = userInput.nextInt();
            if (costOfItem == -1) {
                break;
            }
            initialPrice += costOfItem;
            counter++;
        } while (true);

        double discountPrice = initialPrice * 0.10;

        if (initialPrice >= bonusCondition) {
            priceAfterDiscount = initialPrice - discountPrice;
            System.out.printf("Customer Name: %s%nNumber of item bought: %d%nOriginal cost:%d%nDiscounted cost:%.2f%nThanks for using E-store!!!",
                    customerName, numberOfItem, initialPrice, priceAfterDiscount);

        } else {
            System.out.printf("Customer Name: %s%nNumber of item bought: %d%nOriginal cost:%d%nDiscounted cost:0%nThanks for using E-store!!!",
                    customerName, numberOfItem, initialPrice);
        }

    }
}
