import java.util.Scanner;

public class FishingBoat04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budgetGroup = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFisherman = Integer.parseInt(scanner.nextLine());
        int priceBoat = 0;
        double finalPrice = 0;

        switch (season) {
            case "Spring":
                priceBoat = 3000;
                break;
            case "Summer":
            case "Autumn":
                priceBoat = 4200;
                break;
            case "Winter":
                priceBoat = 2600;
                break;
        }

        if (numberFisherman <= 6) {
            finalPrice = priceBoat - priceBoat * 0.10;
        } else if (numberFisherman >= 7 && numberFisherman <= 11) {
            finalPrice = priceBoat - priceBoat * 0.15;
        } else if (numberFisherman >= 12) {
            finalPrice = priceBoat - priceBoat * 0.25;
        }

        if (numberFisherman % 2 == 0 && !season.equals("Autumn")) {
            finalPrice = finalPrice - finalPrice * 0.05;
        }

        if (budgetGroup >= finalPrice) {
            double leftMoney = budgetGroup - finalPrice;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else if (budgetGroup < finalPrice) {
            double neededMoney = finalPrice - budgetGroup;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }
}
