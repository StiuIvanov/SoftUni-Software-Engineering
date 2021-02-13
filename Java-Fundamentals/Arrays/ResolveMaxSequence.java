import java.util.Scanner;

public class ResolveMaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputText = scanner.nextLine().split("\\s+");
        int[] numbers = new int[inputText.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputText[i]);
        }
        int maxCount = 0;
        int maxIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            int countLength = 0;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] != numbers[j]) {
                    break;
                }
                countLength++;
                if (maxCount < countLength) {
                    maxCount= countLength;
                    maxIndex = i;
                }
            }
        }
        for (int i = maxIndex; i <maxIndex+maxCount ; i++) {
            System.out.print(numbers[i] + " ");

        }

    }
}
