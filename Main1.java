import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private Product[] products;
    private int[] quantities;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public ShoppingCart() {
        products = new Product[INITIAL_CAPACITY];
        quantities = new int[INITIAL_CAPACITY];
        size = 0;
    }

    private void resizeArrays() {
        int newCapacity = products.length * 2;
        Product[] newProducts = new Product[newCapacity];
        int[] newQuantities = new int[newCapacity];
        System.arraycopy(products, 0, newProducts, 0, size);
        System.arraycopy(quantities, 0, newQuantities, 0, size);
        products = newProducts;
        quantities = newQuantities;
    }

    public void addProduct(Product product, int quantity) {
        if (size >= products.length) {
            resizeArrays();
        }
        products[size] = product;
        quantities[size] = quantity;
        size++;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += products[i].getPrice() * quantities[i];
        }
        return total;
    }

    public void displayInvoice() {
        System.out.println("Invoice:");
        double total = calculateTotal();
        double discount = total > 100 ? 0.1 * total : 0;
        double vat = 0.075 * total;
        double totalWithDiscount = total - discount;
        double totalWithVat = totalWithDiscount + vat;

        for (int i = 0; i < size; i++) {
            System.out.printf("%s: %d x $%.2f%n", products[i].getName(), quantities[i], products[i].getPrice());
        }
        System.out.printf("Total: $%.2f%n", total);
        System.out.printf("Discount (if applicable): $%.2f%n", discount);
        System.out.printf("VAT (7.5%%): $%.2f%n", vat);
        System.out.printf("Total with VAT: $%.2f%n", totalWithVat);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name and price of the product:");
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the quantity:");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product, quantity);

        cart.displayInvoice();
    }
}
