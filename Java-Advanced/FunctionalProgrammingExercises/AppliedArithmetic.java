import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], int[]> addOne = arr -> Arrays.stream(arr).map(e -> e += 1).toArray();
        Function<int[], int[]> multiplyByTwo = arr -> Arrays.stream(arr).map(e -> e * 2).toArray();
        Function<int[], int[]> subtractOne = arr -> Arrays.stream(arr).map(e -> e - 1).toArray();
        Consumer<int[]> printNumbers = arr -> Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers= addOne.apply(numbers);
                    break;
                case "multiply":
                    numbers =  multiplyByTwo.apply(numbers);
                    break;
                case "subtract":
                    numbers=subtractOne.apply(numbers);
                    break;
                case "print":
                    printNumbers.accept(numbers);
                    System.out.println();
                    break;
            }


            command = scanner.nextLine();
        }


    }
}
