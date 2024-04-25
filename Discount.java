public class Discount {
    public static void main(String[] args) {
        double price = 2100.0;

        double discount = 0.10 * price;

        double discountedPrice = price - discount;

        System.out.println("Discounted price: " + discountedPrice);
    }
}
