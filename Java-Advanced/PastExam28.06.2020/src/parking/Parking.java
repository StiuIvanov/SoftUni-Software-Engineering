package parking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Parking {
    private String type;
    private int capacity;
    private List<Car> data;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    public void add(Car car) {
        if (data.size()<capacity){
            data.add(car);
        }
    }


    public boolean remove(String manufacturer, String model) {
        Car toRemove =null;
        boolean removed = false;
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer)&&car.getModel().equals(model)){
                toRemove=car;
                removed=true;
            }
        }
        if (removed){
        data.remove(toRemove);
            return true;
        }
        return false;
    }

    public Car getLatestCar() {
        if (data.isEmpty()){
        return null;
        }
        return data.stream().max(Comparator.comparingInt(Car::getYear)).get();

    }

    public Car getCar(String manufacturer, String model) {
        if (data.isEmpty()){
        return null;
        }
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer)&&car.getModel().equals(model)){
                return car;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("The cars are parked in %s:",type));
        for (Car car : data) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(car);
        }
        return stringBuilder.toString();
    }
}
