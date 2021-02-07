import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfNights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentOthers = Integer.parseInt(scanner.nextLine());

        if (numberOfNights > 7){
            pricePerNight = pricePerNight - pricePerNight * 0.05;
        }
        double sumNight = pricePerNight * numberOfNights;
        double sumWithOTher = (percentOthers / 100.0) * budget;
        double sumTotal = sumNight + sumWithOTher;
        if (sumTotal < budget) {
            double difference =  budget - sumTotal;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", difference );
        } else {
            double difference = sumTotal - budget;
            System.out.printf("%.2f leva needed.", difference);
        }


    }
}
