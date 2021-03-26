import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nm = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> n = new LinkedHashSet<>();
        Set<Integer> m = new LinkedHashSet<>();

        for (int i = 0; i < nm[0]; i++) {
            n.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < nm[1]; i++) {
            m.add(Integer.parseInt(scanner.nextLine()));
        }

        for (Integer integer : m) {
            if (n.contains(integer)){
                System.out.print(integer + " ");
            }
        }

    }
}
