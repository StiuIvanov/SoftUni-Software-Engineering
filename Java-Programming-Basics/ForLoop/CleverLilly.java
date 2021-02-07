import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int numberOfToys = 0;
        int timesMoneyForBirthday = 0;
        int sumFromBirthday = 0;
        for (int currentAge = 1; currentAge <= age; currentAge++) {
            if (currentAge % 2 != 0) {
                numberOfToys += 1;
            } else {
                sumFromBirthday = sumFromBirthday+ timesMoneyForBirthday*10 + 10 ;
                timesMoneyForBirthday += 1;
            }
        }
        int sumFromToys = numberOfToys * priceToy;
        double sumFromEvenAge = sumFromBirthday - timesMoneyForBirthday;
        double sum = sumFromEvenAge + sumFromToys;
        if (sum >= priceWashingMachine) {
            double difference = sum - priceWashingMachine;
            System.out.printf("Yes! %.2f", difference);
        } else {
            double difference = priceWashingMachine - sum;
            System.out.printf("No! %.2f", difference);
        }
    }
}
