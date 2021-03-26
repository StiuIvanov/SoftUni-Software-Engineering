import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lenghts = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = lenghts[0];
        int m = lenghts[1];

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();


        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            set1.add(current);
        }

        for (int i = 0; i < m; i++) {
            int curr = Integer.parseInt(scanner.nextLine());
            set2.add(curr);
        }

        for (Integer integer : set1) {
            if (set2.contains(integer)){
                System.out.print(integer + " ");
            }
        }


    }
}
