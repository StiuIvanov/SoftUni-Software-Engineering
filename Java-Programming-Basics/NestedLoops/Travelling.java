import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destinationName = scanner.nextLine();
        while (true) {
            if (destinationName.equals("End")) {
                break;
            }
            double savingsTotal = 0;
            double neededBudget = Double.parseDouble(scanner.nextLine());
            double curentSavings = Double.parseDouble(scanner.nextLine());
            while (true) {
                savingsTotal += curentSavings;
                if (savingsTotal >= neededBudget){
                    break;
                }
                curentSavings = Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!\n", destinationName);
            destinationName = scanner.nextLine();
        }
    }
}

