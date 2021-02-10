package bg.softuni.fundamentals;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        String startCommand = scanner.nextLine();
        while (!startCommand.equals("Start")) {
            double valueCoin = Double.parseDouble(startCommand);
            if (valueCoin == 0.1) {
                sum += valueCoin;
            } else if (valueCoin == 0.2) {
                sum += valueCoin;
            } else if (valueCoin == 0.5) {
                sum += valueCoin;
            } else if (valueCoin == 1) {
                sum += valueCoin;
            } else if (valueCoin == 2) {
                sum += valueCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", valueCoin);
            }
            startCommand = scanner.nextLine();
        }
        double price = 0;
        String endCommand = scanner.nextLine();
        while (!endCommand.equals("End")) {
            switch (endCommand) {
                case "Nuts":
                    price = 2.0;
                    sum -= price;
                    if (sum > price) {
                        System.out.println(String.format("Purchased %s", endCommand));
                    } else {
                        System.out.println("Sorry, not enough money.");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    sum -= price;
                    if (sum > price) {
                        System.out.println(String.format("Purchased %s", endCommand));
                    } else {
                        System.out.println("Sorry, not enough money.");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    sum -= price;
                    if (sum > price) {
                        System.out.println(String.format("Purchased %s", endCommand));
                    } else {
                        System.out.println("Sorry, not enough money.");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    sum -= price;
                    if (sum > price) {
                        System.out.println(String.format("Purchased %s", endCommand));
                    } else {
                        System.out.println("Sorry, not enough money.");
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    sum -= price;
                    if (sum > price) {
                        System.out.println(String.format("Purchased %s", endCommand));
                    } else {
                        System.out.println("Sorry, not enough money.");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            endCommand = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
