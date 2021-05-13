package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    public String toString() {
        return String.format("%s - %.2f", this.name, this.getOverallCalories());
    }

    private void setToppings(int numberOfToppings) {
        validateNumberOfToppings(numberOfToppings);
        this.toppings = new ArrayList<>(numberOfToppings);

    }

    private void setName(String name) {
        validateName(name);
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double doughCalories = dough.calculateCalories();
        double sumToppings = this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
        return sumToppings + doughCalories;
    }

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }


    private void validateNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }
}
