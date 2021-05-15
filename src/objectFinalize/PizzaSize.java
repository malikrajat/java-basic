package objectFinalize;

public enum PizzaSize {
    LARGE("LARGE Size"),
    MEDIUM("MEDIUM Size"),
    SMALL("SMALL Size");

    private String pizzaSizeText;

    PizzaSize (String pizzaSizeText) {
        this.pizzaSizeText = pizzaSizeText;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }
}
