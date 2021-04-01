import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(SortEvenNumbers::isEven)
                .toArray();

        System.out.println(formatArray(numbers));
        Arrays.sort(numbers);
        System.out.println(formatArray(numbers));
    }

    private static String formatArray (int[] arr){
        return Arrays.stream(arr).mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isPrime(int number) {
         return IntStream.range(2, number).noneMatch(n -> number % n == 0);
    }
}
