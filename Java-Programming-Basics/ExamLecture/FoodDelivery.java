import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numChickenMenus = Integer.parseInt(scanner.nextLine());
        int numFishMenus = Integer.parseInt(scanner.nextLine());
        int numVegetarianMenus = Integer.parseInt(scanner.nextLine());

        double chickenMenus = numChickenMenus * 10.35;
        double fishMenus = numFishMenus * 12.40;
        double vegetarianMenus = numVegetarianMenus * 8.15;
        double  totalMenusPrice = chickenMenus + fishMenus +vegetarianMenus;
        double  finalPrice = totalMenusPrice*0.2 + totalMenusPrice+2.50;
        System.out.printf("Total: %.2f", finalPrice);
    }
}
