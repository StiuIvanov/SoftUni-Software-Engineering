import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInts = Integer.parseInt(scanner.nextLine());
        int odds = 0;
        int evens = 0;
        int currentInt = 0;
        for (int i = 1; i <= numberOfInts; i++) {
            currentInt = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 1) {
                evens = evens + currentInt;
            } else {
                odds = odds + currentInt;
            }
        }
        if (odds == evens) {
            System.out.println("Yes");
            System.out.println("Sum = " + odds);
        } else {
            int difference = Math.abs(evens - odds);
            System.out.printf("No%n");
            System.out.printf("Diff = %d", difference);
        }
    }
}
