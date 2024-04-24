public class RiderWageCalculator {
    public static void main(String[] args) {
        int successfulDeliveries = 25; 
        int riderWage = calculateRiderWage(successfulDeliveries);
        System.out.println("Rider's wage for the day: N" + riderWage);
    }

    public static int calculateRiderWage(int successfulDeliveries) {
        int basePay = 5000;
        int amountPerParcel = 0;

        if (successfulDeliveries < 50) {
            amountPerParcel = 160;
        } else if (successfulDeliveries >= 50 && successfulDeliveries < 60) {
            amountPerParcel = 200;
        } else if (successfulDeliveries >= 60 && successfulDeliveries < 70) {
            amountPerParcel = 250;
        } else if (successfulDeliveries >= 70) {
            amountPerParcel = 500;
        }

        int riderWage = basePay + (successfulDeliveries * amountPerParcel);
        return riderWage;
    }
}
