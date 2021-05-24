package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!isValidFlourType(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!isValidBakingTechnique(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double modifierBakingTechnique = DoughModifier.valueOf(this.bakingTechnique.toUpperCase()).getModifier();
        double modifierFlourType = DoughModifier.valueOf(this.flourType.toUpperCase()).getModifier();
        return 2 * weight * modifierFlourType * modifierBakingTechnique;
    }


    private boolean isValidBakingTechnique(String bakingTechnique) {
        return bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") ||
                bakingTechnique.equals("Homemade");
    }


    private boolean isValidFlourType(String flourType) {
        return flourType.equals("White") || flourType.equals("Wholegrain");
    }

}
