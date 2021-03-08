import java.text.DecimalFormat;
import java.util.Scanner;

public class LetterChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        String[] input = scanner.nextLine().split("\\s+");

        sum = getMagicSum(sum, input);

        System.out.printf("%.2f", sum);
    }

    private static double getMagicSum(double sum, String[] input) {
        for (int i = 0; i < input.length; i++) {
            String currentString = input[i];
            char firstChar = currentString.charAt(0);
            double number = Double.parseDouble((String) currentString.subSequence(1, currentString.length() - 1));
            char lastChar = currentString.charAt(currentString.length() - 1);

            int firstCharNumberAscii = 0;
            if (Character.isUpperCase(firstChar)) {
              firstCharNumberAscii = firstChar - 64;
                number /= firstCharNumberAscii;
            } else {
            firstCharNumberAscii= firstChar-96;
                number *= firstCharNumberAscii;
            }

            int indexLastChar = 0;
            if (Character.isUpperCase(lastChar)) {
             indexLastChar = lastChar - 64;
                number -= indexLastChar;
            } else {
                indexLastChar = lastChar - 96;
                number += indexLastChar;
            }

            sum+=number;
        }
        return sum;
    }
}
