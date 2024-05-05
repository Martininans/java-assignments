import java.util.*;

public class PizzaWahalaSolution {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        List<Pizza> pizzaList = new ArrayList<>();

        Pizza odogwuPizza = new Pizza(PizzaType.Odogwu, 12, 4200);
        pizzaList.add(odogwuPizza);

        Pizza sapaSizePizza = new Pizza(PizzaType.Sapa_Size, 4, 2000);
        pizzaList.add(sapaSizePizza);

        Pizza smallMoneyPizza = new Pizza(PizzaType.Small_Money, 6, 2400);
        pizzaList.add(smallMoneyPizza);

        Pizza bigBoysPizza = new Pizza(PizzaType.Big_Boys, 8, 3000);
        pizzaList.add(bigBoysPizza);

        System.out.println("Pizza list: " + pizzaList);

        Request request = new Request();
        request.setPizzaType(PizzaType.Big_Boys);
        request.setNumberOfGuests(1);

        String pizzaBoxes = Pizzaservice.numberOfBoxes(request, pizzaList);

        System.out.println("Number of pizza boxes needed: " + pizzaBoxes);
    }
}

class Pizzaservice {
    public static String numberOfBoxes(Request request, List<Pizza> pizzaList) {
        int leftOvers = 0;
        int numberOfBoxes = 0;
        int amountToPay = 0;

        for (Pizza pizza : pizzaList) {
            if (pizza.getPizzaType().equals(request.getPizzaType())) {
                if (request.getNumberOfGuests() - pizza.getNumberOfSlices() == 0) {
                    numberOfBoxes = 1;
                } else {
                    int ratioValue = request.getNumberOfGuests() / pizza.getNumberOfSlices();
                    if (request.getNumberOfGuests() % pizza.getNumberOfSlices() == 0) {
                        numberOfBoxes = ratioValue;
                    } else {
                        numberOfBoxes = ratioValue + 1;
                        leftOvers = (numberOfBoxes * pizza.getNumberOfSlices()) - request.getNumberOfGuests();
                    }
                }
                amountToPay = pizza.getPricePerBox() * numberOfBoxes;
            }
        }
        return "Total number of boxes: " + numberOfBoxes + "  " + "leftovers: " + leftOvers + "  " + "amount to pay: " + amountToPay;
    }
}

class Request {
    private int numberOfGuests;
    private PizzaType pizzaType;

    public Request() {
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }
}

class Pizza {
    private PizzaType pizzaType;
    private int numberOfSlices;
    private int pricePerBox;

    public Pizza() {
    }

    public Pizza(PizzaType pizzaType, int numberOfSlices, int pricePerBox) {
        this.pizzaType = pizzaType;
        this.numberOfSlices = numberOfSlices;
        this.pricePerBox = pricePerBox;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    public int getPricePerBox() {
        return pricePerBox;
    }

    public void setPricePerBox(int pricePerBox) {
        this.pricePerBox = pricePerBox;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaType=" + pizzaType +
                ", numberOfSlices=" + numberOfSlices +
                ", pricePerBox=" + pricePerBox +
                '}';
    }
}

enum PizzaType {
    Sapa_Size, Small_Money, Big_Boys, Odogwu
}
