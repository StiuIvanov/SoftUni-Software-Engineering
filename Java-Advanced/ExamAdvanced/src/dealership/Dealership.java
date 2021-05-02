package dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    private String name;
    private int capacity;
    private List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    public void add(Car car) {
        if (data.size()<capacity){
            data.add(car);
        }
    }


    public boolean buy(String manufacturer, String model) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getManufacturer().equals(manufacturer) &&
                data.get(i).getModel().equals(model)){
                data.remove(data.get(i));
                i--;
                return true;
            }
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
        for (Car c : data) {
            if (c.getManufacturer().equals(manufacturer) && c.getModel().equals(model)){
                return c;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb= new StringBuilder();
        sb  .append(String.format(" The cars are in a car dealership %s:",name));
        for (Car c : data) {
            sb.append(System.lineSeparator());
            sb.append(c);
        }
        return sb.toString();

    }
}
