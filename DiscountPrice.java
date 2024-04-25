import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double discountAmount = price * (discountPercentage / 100);

        double priceAfterDiscount = price - discountAmount;

        System.out.println("Price after discount: " + priceAfterDiscount);

    }
}
