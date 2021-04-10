package Google;

public class Car {
    private String carModel;
    private int carSpeed;

    public Car(String carModel, int carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        if (carModel==null){
            return "";
        }
        return String.format("%n%s %d", carModel, carSpeed);
    }
}
