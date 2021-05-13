package PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!"Meat".equals(toppingType)
                && !"Veggies".equals(toppingType)
                && !"Cheese".equals(toppingType)
                && !"Sauce".equals(toppingType)) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double modifier = ToppingModifier.valueOf(toppingType.toUpperCase()).getModifier();
        return this.weight * 2 * modifier;
    }

}