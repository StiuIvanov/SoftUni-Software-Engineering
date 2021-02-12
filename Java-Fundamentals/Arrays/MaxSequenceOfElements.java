import java.util.Scanner;

public class MaxSequenceOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split(" ");
        int[] inputIntArray = new int[inputString.length];
        for (int i = 0; i < inputString.length; i++) {
            inputIntArray[i] = Integer.parseInt(inputString[i]);
        }
        int countLongest = 0;
        int element = 0;
        for (int i = 0; i < inputIntArray.length; i++) {
            int countTemp = 0;
            for (int j = i + 1; j < inputIntArray.length; j++) {
                if (inputIntArray[i] != inputIntArray[j]) {
                    break;
                }
                countTemp++;
                if (countTemp > countLongest) {
                    countLongest = countTemp;
                    element = inputIntArray[i];
                }
            }
        }
        for (int i = 0; i <= countLongest; i++) {
            System.out.print(element + " ");
        }
    }
}
