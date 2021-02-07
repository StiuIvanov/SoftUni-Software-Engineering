import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = Integer.parseInt(scanner.nextLine());
        int currentNumber = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (int i = 1; i <= inputs; i++) {
            currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber % 2 == 0) {
                p1 += 1;
            }
            if (currentNumber % 3 == 0) {
                p2 += 1;
            }
            if (currentNumber % 4 == 0) {
                p3 += 1;
            }
        }
        p1 = p1 / inputs * 100;
        p2 = p2 / inputs * 100;
        p3 = p3 / inputs * 100;
        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
    }
}
