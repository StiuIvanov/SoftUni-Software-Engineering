import java.util.Scanner;

public class VegetableMarketBONUS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double priceVegetables = n * kgVegetables;
        double priceFruit = m * kgFruits;

        double sumPrice = priceVegetables + priceFruit;
        double sumPriceEuro = sumPrice / 1.94;
        System.out.println(sumPriceEuro);
    }
}
