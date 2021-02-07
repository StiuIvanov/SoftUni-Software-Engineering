import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= numberOfInputs; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber > max) {
                max = currentNumber;
            }
            sum += currentNumber;
        }
        int sumWithoutMax = sum - max;
        if (sumWithoutMax == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int difference = Math.abs(sumWithoutMax - max);
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}
