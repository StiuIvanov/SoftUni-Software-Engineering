package RawData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double tire1Pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);
            double tire2Pressure = Double.parseDouble(tokens[7]);
            int tire2Age = Integer.parseInt(tokens[8]);
            double tire3Pressure = Double.parseDouble(tokens[9]);
            int tire3Age = Integer.parseInt(tokens[10]);
            double tire4Pressure = Double.parseDouble(tokens[11]);
            int tire4Age = Integer.parseInt(tokens[12]);

            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType,
                    tire1Pressure, tire1Age, tire2Pressure, tire2Age,
                    tire3Pressure, tire3Age, tire4Pressure, tire4Age);

            cars.put(model, car);
        }

        String command = scanner.nextLine();
        switch (command) {
            case "fragile":
                cars.entrySet().stream()
                        .filter(e-> e.getValue().getCargo().getCargoType().equals("fragile"))
                        .filter(c-> c.getValue().getTires().pressureIsBellow1())
                        .forEach(s-> System.out.println(s.getValue()));
                break;
            case "flamable":
                cars.entrySet().stream()
                        .filter(e -> e.getValue().getCargo().getCargoType().equals("flamable"))
                        .filter(c-> c.getValue().getEngine().getEnginePower()>250)
                        .forEach(s -> System.out.println(s.getValue()));
                break;
        }



        double newPressure = 2.4;




    }
}
