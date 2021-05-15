package objectEquals;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Pizza)) {
            return false;
        }
        Pizza pizza = (Pizza) o;
//        return Double.compare(pizza.price, price) == 0 &&
//                Objects.equals(name, pizza.name) &&
//                pizzasize == pizza.pizzasize;

//        return name.equals(pizza.name) && price == pizza.price && pizzasize == pizza.pizzasize;
        return Objects.equals(pizza.name, name) && price == pizza.price && pizzasize == pizza.pizzasize;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pizzasize, price);
    }
}
