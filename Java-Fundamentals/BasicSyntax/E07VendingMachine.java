package bg.softuni.fundamentals;

import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sum = 0;
        while (!command.equals("Start")) {
            double coinValue = Double.parseDouble(command);
            if (coinValue == 0.1 || coinValue == 0.2 || coinValue == 0.5 || coinValue == 1 || coinValue == 2) {
                sum += coinValue;
            } else {
                System.out.println(String.format("Cannot accept %.2f", coinValue));
            }
            command = scanner.nextLine();
        }
        //
        //
        command = scanner.nextLine();
        double price = 0;
        while (!command.equals("End")) {
            switch (command) {
                case "Nuts":
                    price = 2.0;
                    if (sum >= price) {
                        System.out.println(String.format("Purchased %s", command));
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (sum >= price) {
                        System.out.println(String.format("Purchased %s", command));
                        sum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (sum >= price) {
                        System.out.println(String.format("Purchased %s", command));
                        sum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (sum >= price) {
                        System.out.println(String.format("Purchased %s", command));
                        sum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    if (sum >= price) {
                        System.out.println(String.format("Purchased %s", command));
                        sum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.format("Change: %.2f", sum));
    }
}
