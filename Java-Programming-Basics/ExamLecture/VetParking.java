import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDays = Integer.parseInt(scanner.nextLine());
        int numHours = Integer.parseInt(scanner.nextLine());
        int evenDaysOddHour = 0;
        int oddDaysEvenCounter = 0;
        int others = 0;
        double  priceTotal = 0;
        for (int i = 1; i <= numDays; i++) {
            evenDaysOddHour=0;
            oddDaysEvenCounter=0;
            others=0;
            for (int j = 1; j <= numHours; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    evenDaysOddHour++;
                } else if (i % 2 == 1 && j % 2 == 0) {
                    oddDaysEvenCounter++;
                } else {
                    others++;
                }
            }
            double priceDay= 0;
            double priceEvenOdd = 2.50 * evenDaysOddHour;
            double priceOddEven = 1.25 * oddDaysEvenCounter;
            double priceOthers = 1 * others;
            priceDay = priceEvenOdd + priceOddEven + priceOthers;
            priceTotal += priceDay;
            System.out.printf("Day: %d - %.2f leva\n", i, priceDay);
        }
        System.out.printf("Total: %.2f leva", priceTotal    );
    }
}
