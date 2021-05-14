package enumConfig;

public class PizzaApp {
    public static void main(String[] args) {
        System.out.println("All Size");
        for (PizzaSize pizzaSize: PizzaSize.values()) {
            System.out.println(" - " + pizzaSize.getPizzaSizeText());
        }
        Pizza pizzaOrder = new Pizza("cheeg", PizzaSize.MEDIUM);
        System.out.println("I ordered following pizza");
        System.out.println("Name : " + pizzaOrder.getName());
        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: " + pizzaOrder.getPrice());

    }
}
