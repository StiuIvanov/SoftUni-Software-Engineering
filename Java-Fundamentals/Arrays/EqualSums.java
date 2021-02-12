import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        boolean noEquals = true;
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            boolean leftIsEqual = false;
            boolean rightIsEqual = false;
            for (int j = i - 1; j >= 0; j--) {
                sum += numbers[j];
            }
            if (sum == numbers[i]) {
                leftIsEqual = true;
            }
            int sumRight = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                sumRight += numbers[j];
            }
            if (sumRight == sum) {
                noEquals = false;
                System.out.println(i);
            }
        }
        if (noEquals) {
            System.out.println("no");
        }

    }
}
