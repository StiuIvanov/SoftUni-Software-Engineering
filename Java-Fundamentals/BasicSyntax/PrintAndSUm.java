package bg.softuni.fundamentals;

import java.util.Scanner;

public class PrintAndSUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputStart = Integer.parseInt(scanner.nextLine());
        int inputEnd = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (; inputStart <= inputEnd; inputStart++) {
            System.out.print(inputStart + " ");
            sum += inputStart;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
