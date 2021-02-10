import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int sumSpice = 0;
        int counterDays = 0;
        while (startingYield >= 100) {
            sumSpice += startingYield;
            sumSpice -= 26;
            counterDays++;
            startingYield -= 10;
        }
        if (sumSpice >= 26) {
            sumSpice -= 26;
        }
        System.out.println(counterDays);
        System.out.println(sumSpice);
    }
}
