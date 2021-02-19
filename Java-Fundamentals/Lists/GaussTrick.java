import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(values.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            int firstNumber = numbers.get(i);
            int secondNumber = numbers.get(numbers.size()-1);
            int sumNumbers = firstNumber + secondNumber;
            if (i == numbers.size() - 1) {
                break;
            }
            numbers.set(i, sumNumbers);
            numbers.remove(numbers.size()-1);
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
