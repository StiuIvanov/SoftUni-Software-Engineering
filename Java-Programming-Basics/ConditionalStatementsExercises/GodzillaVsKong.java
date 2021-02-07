import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetMovie = Double.parseDouble(scanner.nextLine());
        int numSupernumerary = Integer.parseInt(scanner.nextLine());
        double priceClothesPerSupernumerary = Double.parseDouble(scanner.nextLine());
        double budgetDecor = budgetMovie * 0.10;
        double priceClothesTotal = numSupernumerary * priceClothesPerSupernumerary;
        if (numSupernumerary >= 150){
             priceClothesTotal = priceClothesTotal - priceClothesTotal * 0.10;
}
        double budgetTotal = priceClothesTotal + budgetDecor;
        double budgetDifference = Math.abs(budgetTotal - budgetMovie);
        if (budgetTotal <= budgetMovie){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budgetDifference);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", budgetDifference);
        }
    }
}
