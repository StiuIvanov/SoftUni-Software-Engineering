import java.util.Scanner;

public class Barcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int firstDigit = n1 / 1000 % 10;
        int secondDigit = n1 / 100 % 10;
        int thirdDigit = n1 / 10 % 10;
        int fourthDigit = n1 % 10;
        int firstDigitN2 = n2 / 1000 % 10;
        int secondDigitN2 = n2 / 100 % 10;
        int thirdDigitN2 = n2 / 10 % 10;
        int fourthDigitN2 = n2 % 10;
        for (int i = firstDigit; i <= firstDigitN2; i++) {
            for (int j = secondDigit; j <= secondDigitN2; j++) {
                for (int k = thirdDigit; k <= thirdDigitN2; k++) {
                    for (int p = fourthDigit; p <= fourthDigitN2; p++) {
                        if (i % 2 == 1 && j % 2 == 1 && k % 2 == 1 && p % 2 == 1) {
                            System.out.printf("%d%d%d%d ", i, j, k, p);
                        }
                    }
                }
            }
        }
    }
}
