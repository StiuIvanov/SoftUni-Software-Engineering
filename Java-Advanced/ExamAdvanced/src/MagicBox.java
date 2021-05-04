import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < tokens.length; i++) {
            secondBox.push(tokens[i]);
        }

        int sumClaimedItems = 0;

        while (!firstBox.isEmpty() && !secondBox.isEmpty()) {
            int firstValue = firstBox.peek();
            int secondValue = secondBox.pop();
            int sum = firstValue + secondValue;

            if (sum % 2 == 0) {
                sumClaimedItems += sum;
                firstBox.poll();
            } else {
                firstBox.offer(secondValue);
            }

        }

            if (firstBox.isEmpty()) {
                System.out.println("First magic box is empty.");
            } else {
                System.out.println("Second magic box is empty.");
            }

            if (sumClaimedItems >= 90) {
                System.out.printf("Wow, your prey was epic! Value: %d",sumClaimedItems);
            }else{
                System.out.printf("Poor prey... Value: %d",sumClaimedItems);
            }
    }
}
