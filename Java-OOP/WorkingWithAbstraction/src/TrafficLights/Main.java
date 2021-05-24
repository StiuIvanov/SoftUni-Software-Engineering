package TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inititalTrafficLightsStates = scanner.nextLine().split("\\s+");
        int numberOfUpdates = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (int i = 0; i < inititalTrafficLightsStates.length; i++) {
            TrafficLight trafficLight = new TrafficLight(TrafficLightState.valueOf(inititalTrafficLightsStates[i]));
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i < numberOfUpdates; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight + " ");
            }
            System.out.println();
        }
    }
}
