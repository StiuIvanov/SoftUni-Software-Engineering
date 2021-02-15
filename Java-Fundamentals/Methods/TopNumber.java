import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            if (sumDIgitsDivisibleBy8(i) && oneOddDigit(i)) {
                System.out.println(i);
            }
        }


    }



    public static boolean sumDIgitsDivisibleBy8(int number) {
        int sumOfDigits = 0;
        while (number > 0) {
            int currentDigit = 0;
            currentDigit = number % 10;
            sumOfDigits += currentDigit;
            number /= 10;
        }
        if (sumOfDigits % 8 == 0) {
            return true;
        }

        return false;
    }

    public static boolean oneOddDigit(int number) {
        while (number > 0) {
            int currentDigit = 0;
            currentDigit = number % 10;
            if (currentDigit % 2 == 1) {
                return true;
            }
            number /= 10;
        }

        return false;
    }

}
