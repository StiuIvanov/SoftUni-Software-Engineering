import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(i-> Integer.parseInt(i))
                .sorted((a,b) -> Integer.compare(b,a))
                .limit(3)
                .forEach(i -> System.out.print(i + " "));

    }
}
