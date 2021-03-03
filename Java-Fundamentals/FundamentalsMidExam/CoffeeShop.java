import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        for (int i = 0; i < n  ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double coffeePrice = ((days*capsulesCount) * pricePerCapsule)*1.000;

            System.out.printf("The price for the coffee is: $%.2f%n",coffeePrice );
            totalSum+=coffeePrice;
        }

        System.out.printf("Total: $%.2f", totalSum );

    }
}
