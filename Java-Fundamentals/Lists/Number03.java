import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Number03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String[] inputText = scanner.nextLine().split(" ");
        for (String s : inputText) {
            int n = Integer.parseInt(s);
            numbers.add(n);
        }
        int sum = 0;
        double averageSum = 0;
        for (int n : numbers) {
            sum += n;
        }
        averageSum = sum * 1.0 / numbers.size();
        List<Integer> numbersDescending = new ArrayList<>();
        for (int n : numbers) {
            if (n > averageSum) {
                numbersDescending.add(n);
            }
        }

        Collections.sort(numbersDescending, Collections.reverseOrder());
        if (numbersDescending.isEmpty()) {
            System.out.println("No");
        } else {
            for (int i = 0; i < numbersDescending.size(); i++) {
                if (i > 4) {
                    break;
                }
                System.out.print(numbersDescending.get(i) + " ");

            }
        }
    }
}
