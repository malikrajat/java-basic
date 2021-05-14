package enumConfig;

public class Pizza {
    private String name;
    private PizzaSize pizzasize;
    private double price;

    public Pizza(String name, PizzaSize pizzasize) {
        this.name = name;
        this.pizzasize = pizzasize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (pizzasize) {
            case SMALL:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
            default:
                return 4.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzasize;
    }

    public double getPrice() {
        return price;
    }
}
