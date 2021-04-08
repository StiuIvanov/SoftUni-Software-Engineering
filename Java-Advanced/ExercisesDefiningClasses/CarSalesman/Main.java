package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Engine> engineMap = new HashMap<>();
        Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);

            Engine engine;
            if (tokens.length == 4) {
                int displacement = Integer.parseInt(tokens[2]);
                String efficiency = tokens[3];
                engine = new Engine(model, power, displacement, efficiency);
            } else if (tokens.length == 3) {
                try {
                    int displacement = Integer.parseInt(tokens[2]);
                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException ex) {
                    String efficiency = tokens[2];
                    engine = new Engine(model, power, efficiency);
                }
            } else {
                engine = new Engine(model, power);
            }
            engineMap.putIfAbsent(model, engine);

        }

        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] tokensCar = scanner.nextLine().split("\\s+");

            String model = tokensCar[0];
            String engine = tokensCar[1];

            Car car;
            if (tokensCar.length == 3) {
                try {
                    int weight = Integer.parseInt(tokensCar[2]);
                    car = new Car(model, engineMap.get(engine),weight);
                } catch (NumberFormatException ex) {
                    String color = tokensCar[2];
                    car = new Car(model, engineMap.get(engine),color);
                }
            } else if (tokensCar.length == 4) {
                int weight = Integer.parseInt(tokensCar[2]);
                String color = tokensCar[3];
                car = new Car(model, engineMap.get(engine),weight,color);
            } else {
                car = new Car(model, engineMap.get(engine));
            }

            cars.putIfAbsent(model,car);
            System.out.println(car);
        }


    }
}
