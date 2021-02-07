import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int numDaysSpending = 0;
        int numDaysTotal = 0;
        boolean succeed = true;
        while (ownedMoney < neededMoney) {
            String action = scanner.nextLine();
            double actionSum = Double.parseDouble(scanner.nextLine());
            numDaysTotal++;
            if (action.equals("save")) {
                ownedMoney += actionSum;
                numDaysSpending = 0;
            } else {
                numDaysSpending++;
                if (numDaysSpending == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(numDaysTotal);
                    succeed = false;
                    break;
                }
                ownedMoney -= actionSum;
                if (ownedMoney<=0 ) {
                    ownedMoney = 0;
                }
            }
        }
        if (succeed) {
            System.out.printf("You saved the money for %d days.", numDaysTotal);
        }

    }
}
