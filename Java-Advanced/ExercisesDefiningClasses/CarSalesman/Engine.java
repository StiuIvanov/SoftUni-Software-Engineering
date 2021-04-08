package CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;// TODO: 2/2/2021 opt
    private String efficiency = "n/a";// TODO: 2/2/2021 opt

    @Override
    public String toString() {
        return String.format("%s:%n"+
                "Power: %d%n" +
                "Displacement: %s%n" +
                "Efficiency: %s%n",model,power,displacementCheckNull(),efficiency);
    }

    public String displacementCheckNull(){
        if (displacement==0){
            return "n/a";
        }
        return String.valueOf(displacement);
    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
}
