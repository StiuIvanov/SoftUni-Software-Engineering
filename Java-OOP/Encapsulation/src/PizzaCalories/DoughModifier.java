package PizzaCalories;

public enum DoughModifier {
    WHITE (1.5),
    WHOLEGRAIN(1.0),
    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);

    private final double modifier;

    DoughModifier( double modifier){
        this.modifier=modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
