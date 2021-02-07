import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numDrinks = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        switch (drink) {
            case "Espresso":
                switch (sugar) {
                    case "Without":
                        sum = numDrinks * 0.90;
                        break;
                    case "Normal":
                        sum = numDrinks * 1;
                        break;
                    case "Extra":
                        sum = numDrinks * 1.20;
                        break;
                }
                break;
            case "Cappuccino":
                switch (sugar) {
                    case "Without":
                        sum = numDrinks * 1;
                        break;
                    case "Normal":
                        sum = numDrinks * 1.20;
                        break;
                    case "Extra":
                        sum = numDrinks * 1.60;
                        break;
                }
                break;
            case "Tea":
                switch (sugar) {
                    case "Without":
                        sum = numDrinks * 0.50;
                        break;
                    case "Normal":
                        sum = numDrinks * 0.60;
                        break;
                    case "Extra":
                        sum = numDrinks * 0.70;
                        break;
                }
                break;
        }
        switch (sugar) {
            case "Without":
                sum = sum * 0.65;
                break;
        }
        if (drink.equals("Espresso") && numDrinks >= 5) {
            sum = sum * 0.75;
        }
        if (sum > 15) {
            sum = sum    * 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", numDrinks, drink, sum);
    }
}
