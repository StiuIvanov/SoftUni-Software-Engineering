import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numsAsString = scanner.nextLine().split(" ");

        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < numsAsString.length; i++) {
            numbers.add(Double.parseDouble(numsAsString[i]));
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = -1;
            }
        }

        String output = "";
        for (double num : numbers) {
            output= output + (new DecimalFormat("0.#").format(num)) + " ";
        }
        System.out.println(output);
    }
}
