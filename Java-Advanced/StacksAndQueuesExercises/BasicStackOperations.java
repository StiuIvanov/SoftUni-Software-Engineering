import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int n = firstLine[0];
        int s = firstLine[1];
        int x = firstLine[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(secondLine[i]);
        }

        for (int i = 0; i < s; i++) {
            if (stack.isEmpty()) {
                break;
            }
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                int smallestNumber = Integer.MAX_VALUE;
                while (!stack.isEmpty()) {
                    int currentNumber = stack.pop();
                    if (smallestNumber > currentNumber) {
                        smallestNumber = currentNumber;
                    }
                }
                System.out.println(smallestNumber);
            }
        }
    }
}