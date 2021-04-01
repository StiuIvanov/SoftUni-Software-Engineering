import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isUpperCase = str->Character.isUpperCase(str.charAt(0)) ;

        List<String> wordsWithUpperCase = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(isUpperCase::test)
                .collect(Collectors.toList());

        System.out.println(wordsWithUpperCase.size());
        wordsWithUpperCase.forEach(System.out::println);

    }
}
