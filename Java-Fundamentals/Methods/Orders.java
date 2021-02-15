import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        switch (product) {
            case "water": waterSum(quantity); break;
            case "coffee": coffeeSum(quantity); break;
            case "snacks": snacksSum(quantity); break;
            case "coke": cokeSum(quantity); break;
        }
    }

    public static void waterSum(int quantity) {
        double sum = quantity * 1;
        System.out.printf("%.2f", sum);
    }

    public static void coffeeSum(int quantity) {
        double sum = quantity * 1.50;
        System.out.printf("%.2f", sum);
    }

    public static void cokeSum(int quantity) {
        double sum = quantity * 1.40;
        System.out.printf("%.2f", sum);
    }

    public static void snacksSum(int quantity) {
        double sum = quantity * 2;
        System.out.printf("%.2f", sum);
    }




}
