package PokemonTrainer2;

public class Pokemon {
    private String name;
    private String element;
    private int health;

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth() {
        this.health = this.health - 10;
    }

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }
}
