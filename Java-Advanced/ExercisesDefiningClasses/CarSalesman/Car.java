package CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight; // TODO: 2/2/2021 opt
    private String color= "n/a";// TODO: 2/2/2021 opt

    @Override
    public String toString() {
        return String.format("%s:%n" +
                "%s" +
                "Weight: %s%n" +
                "Color: %s",model,engine,weightCheckNull(),color);
    }

    public String weightCheckNull(){
        if (weight==0){
            return "n/a";
        }
        return String.valueOf(weight);
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
}
