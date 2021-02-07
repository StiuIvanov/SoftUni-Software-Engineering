import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberofIntsSquare = Integer.parseInt(scanner.nextLine());
        int currentNumber = 0;
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 1; i <= numberofIntsSquare; i++) {
            currentNumber = Integer.parseInt(scanner.nextLine());
            firstSum = currentNumber + firstSum;
        }
        for (int i = 1; i <= numberofIntsSquare; i++) {
            currentNumber = Integer.parseInt(scanner.nextLine());
            secondSum = currentNumber + secondSum;
        }
        if (secondSum==firstSum){
            System.out.println("Yes, sum = " + firstSum);
        } else {
            int sumDifference = Math.max(firstSum, secondSum) - Math.min(firstSum, secondSum);
            System.out.println("No, diff = " + sumDifference);
        }
    }
}
