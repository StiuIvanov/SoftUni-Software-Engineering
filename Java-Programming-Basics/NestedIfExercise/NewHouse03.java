import java.util.Scanner;

public class NewHouse03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowersQuantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double priceFinal = 0;

        switch (flowersType) {
            case "Roses":
                priceFinal = flowersQuantity * 5;
                if (flowersQuantity > 80) {
                    priceFinal = priceFinal - priceFinal * 0.10;
                }
                break;
            case "Dahlias":
                priceFinal = flowersQuantity * 3.80;
                if (flowersQuantity > 90) {
                    priceFinal = priceFinal - priceFinal * 0.15;
                }
                break;
            case "Tulips":
                priceFinal = flowersQuantity * 2.80;
                if (flowersQuantity > 80) {
                    priceFinal = priceFinal - priceFinal * 0.15;
                }
                break;
            case "Narcissus":
                priceFinal = flowersQuantity * 3;
                if (flowersQuantity < 120) {
                    priceFinal = priceFinal + priceFinal * 0.15;
                }
                break;
            case "Gladiolus":
                priceFinal = flowersQuantity * 2.5;
                if (flowersQuantity < 80) {
                    priceFinal = priceFinal + priceFinal * 0.20;
                }
                break;
        }
        if (budget >= priceFinal) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersQuantity, flowersType, budget - priceFinal);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", priceFinal - budget);
        }
    }
}
