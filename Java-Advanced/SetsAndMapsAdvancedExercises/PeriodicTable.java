import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> elements = new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int j = 0; j < tokens.length; j++) {
                elements.add(tokens[j]);
            }
        }

        System.out.println(elements.stream().collect(Collectors.joining(" ")));

    }
}
