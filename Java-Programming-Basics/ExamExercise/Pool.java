import java.util.Scanner;

public class Pool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double pricePerSunbed = Double.parseDouble(scanner.nextLine());
        double pricePerUmbrella = Double.parseDouble(scanner.nextLine());
        double sumFromTax = tax * numberOfPeople;
        double peopleWithUmbrella = Math.ceil(numberOfPeople / 2.0);
        double sumFromUmbrella = pricePerUmbrella *  peopleWithUmbrella;
        double sumFromSunbed = Math.ceil(numberOfPeople * 0.75) * pricePerSunbed;
        double sumTotal = sumFromSunbed + sumFromTax + sumFromUmbrella;
        System.out.printf("%.2f lv.", sumTotal);

    }
}
