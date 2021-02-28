import java.util.Scanner;

public class ComputerStore01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumPrices = 0;

        String command = scanner.nextLine();
        while (!command.equals("special") && !command.equals("regular")) {
            double price = Double.parseDouble(command);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                sumPrices += price;
            }

            command = scanner.nextLine();
        }
        double amountOfTaxes = sumPrices*0.2;
        double sumWithTaxes = sumPrices + amountOfTaxes;

        if (command.equals("special")){
            sumWithTaxes = sumWithTaxes - sumWithTaxes*0.1;
        }
        double totalPrice = sumWithTaxes;




        if (sumWithTaxes==0){
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sumPrices);
            System.out.printf("Taxes: %.2f$%n", amountOfTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);
        }
    }
}
