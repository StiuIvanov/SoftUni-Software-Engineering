import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double neededGas = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double literGas = neededGas * 2.10;
        double pricePlusGid = 100 + literGas;
        if (day.equals("Saturday")) {
            pricePlusGid = pricePlusGid - pricePlusGid * 0.1;
        } else if (day.equals("Sunday")) {
            pricePlusGid = pricePlusGid - pricePlusGid * 0.2;
        }
        if (budget >= pricePlusGid) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - pricePlusGid);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", pricePlusGid - budget);
        }


    }
}
