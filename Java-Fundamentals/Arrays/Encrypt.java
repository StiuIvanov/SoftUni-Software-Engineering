import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] codedNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int currentSum = 0;
            for (int j = 0; j < input.length(); j++) {
                char token = input.charAt(j);
                int number = token;
                if (token == 'a' || token == 'e' || token == 'i' || token == 'o' || token == 'u' ||
                        token == 'A' || token == 'E' || token == 'I' || token == 'O' || token == 'U') {
                    number = number * input.length();
                } else {
                    number = number / input.length();
                }
                currentSum += number;
                codedNumbers[i]= currentSum;
            }
        }
        Arrays.sort(codedNumbers);
        for (int num:codedNumbers             ) {
            System.out.println(num);
        }
    }
}
