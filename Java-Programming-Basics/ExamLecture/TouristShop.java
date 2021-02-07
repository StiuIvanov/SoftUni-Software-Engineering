import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double totalPriceItems = 0;
        int countProduct = 0;
        boolean flag = true;
        while (true) {
            String itemName = scanner.nextLine();
            if (itemName.equals("Stop")) {
                break;
            }
            double itemPrice = Double.parseDouble(scanner.nextLine());
            countProduct++;
            if (countProduct % 3 == 0) {
                itemPrice = itemPrice/2;
            }
            totalPriceItems += itemPrice;
            if (totalPriceItems > budget) {
                System.out.printf("You don't have enough money!\n");
                System.out.printf("You need %.2f leva!", totalPriceItems - budget);
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.printf("You bought %d products for %.2f leva.", countProduct, totalPriceItems);
    }
}
