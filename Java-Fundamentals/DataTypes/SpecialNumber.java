import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int sumOfDigits = 0;
        int input = Integer.parseInt(inputString);
        for (int i = 1; i <= input; i++) {
            int number = i;
            sumOfDigits=0;
            while (number > 0) {
                sumOfDigits += number % 10;
                number /= 10;
            }
            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
                System.out.println(String.format("%d -> True", i));
            } else {
                System.out.println(String.format("%d -> False", i));
            }
        }
    }
}
