import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputText = scanner.nextLine().split("\\s+");
        int[] numbers = new int[inputText.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputText[i]);
        }
        int sumEven = 0;
        int sumOdds = 0;
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven+=numbers[i];
            } else {
                sumOdds += numbers[i];
            }
        }
        int subtractionSum = sumEven- sumOdds;
        System.out.println(subtractionSum);
    }
}
