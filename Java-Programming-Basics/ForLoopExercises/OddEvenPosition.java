import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInputs = Integer.parseInt(scanner.nextLine());
        double currentNumber = 0;
        double maxOdds = Integer.MIN_VALUE;
        double maxEvens = Integer.MIN_VALUE;
        double minOdds = Integer.MAX_VALUE;
        double minEvens = Integer.MAX_VALUE;
        double sumOdds = 0;
        double sumEvens = 0;
        for (int i = 1; i <= numberInputs; i++) {
            currentNumber = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 1) {
                sumOdds += currentNumber;
                if (currentNumber > maxOdds) {
                    maxOdds = currentNumber;
                }
                if (currentNumber < minOdds) {
                    minOdds = currentNumber;
                }
            } else {
                sumEvens += currentNumber;
                if (currentNumber > maxEvens) {
                    maxEvens = currentNumber;
                }
                if (currentNumber < minEvens) {
                    minEvens = currentNumber;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", sumOdds);
        if (minOdds == Integer.MAX_VALUE) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", minOdds);

        }
        if (maxOdds == Integer.MIN_VALUE) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", maxOdds);
        }
        System.out.printf("EvenSum=%.2f,%n", sumEvens);
        if (minEvens == Integer.MAX_VALUE) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", minEvens);
        }
        if (maxEvens == Integer.MIN_VALUE) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f%n", maxEvens);
        }

    }
}
