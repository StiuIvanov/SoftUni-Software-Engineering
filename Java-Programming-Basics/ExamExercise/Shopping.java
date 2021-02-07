import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numVideocards = Integer.parseInt(scanner.nextLine());
        int numProcessors = Integer.parseInt(scanner.nextLine());
        int numRams = Integer.parseInt(scanner.nextLine());

        int sumVideocards = numVideocards * 250;
        double sumProcessors = 0.35 * sumVideocards * numProcessors;
        double sumRams = 0.1 * sumVideocards * numRams;
        double sumTotal = sumVideocards + sumProcessors + sumRams;
        if (numVideocards > numProcessors) {
            sumTotal = sumTotal * 0.85;
        }
        if (budget >= sumTotal) {
            double difference = budget- sumTotal;
            System.out.printf("You have %.2f leva left!", difference );
        } else {
            double difference = sumTotal - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }

    }
}
