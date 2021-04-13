package RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tires tires;

    public Car(String model,int engineSpeed,
               int enginePower, int cargoWeight, String cargoType,
               double tire1Pressure, int tire1Age,
               double tire2Pressure, int tire2Age,
               double tire3Pressure, int tire3Age,
               double tire4Pressure, int tire4Age) {
        this.model = model;
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires = new Tires(tire1Pressure,tire1Age,
                tire2Pressure,tire2Age,
                tire3Pressure,tire3Age,
                tire4Pressure,tire4Age);
    }

    @Override
    public String toString() {
        return model;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tires getTires() {
        return tires;
    }
}
