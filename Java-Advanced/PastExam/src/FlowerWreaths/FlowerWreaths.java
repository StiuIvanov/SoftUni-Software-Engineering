package FlowerWreaths;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> lilies = new ArrayDeque<>();
        int[] ints = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < ints.length; i++) {
            lilies.push(ints[i]);
        }

        ArrayDeque<Integer> roses = Arrays.stream(scanner.nextLine()
                .split(",\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int wreaths = 0;
        int storedFlowers = 0;

        while (!roses.isEmpty()){
            int liliesValue = lilies.pop();
            int rosesValue = roses.poll();
            while (true) {
                int sum = liliesValue + rosesValue;
                if (sum == 15) {
                    wreaths++;
                    break;
                } else if (sum > 15) {
                    liliesValue -= 2;
                    continue;
                } else {
                    storedFlowers += sum;
                    break;
                }
            }
        }

        int wreathsFromLeftovers = storedFlowers / 15;
        wreaths += wreathsFromLeftovers;

        String result = wreaths >= 5 ? String.format("You made it, you are going to the competition with %d wreaths!", wreaths)
                                      : String.format("You didn't make it, you need %d wreaths more!", 5-wreaths);

        System.out.println(result);

    }
}
