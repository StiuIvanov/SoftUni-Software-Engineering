import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputText = scanner.nextLine().split("\\s+");
        int[] numbers = new int[inputText.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputText[i]);
        }
        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length-1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;

        }
        for (int n : numbers) {
            System.out.print(n +" ");

        }

    }
}
