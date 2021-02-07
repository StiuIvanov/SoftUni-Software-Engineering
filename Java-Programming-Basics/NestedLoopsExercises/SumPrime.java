import java.util.Scanner;

public class SumPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNotPrime = 0;
        while (!input.equals("stop")) {
            int n = Integer.parseInt(input);
            if (n < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sumPrime += n;
            } else {
                sumNotPrime += n;
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNotPrime);
    }
}
