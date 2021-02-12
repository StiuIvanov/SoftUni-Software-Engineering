import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> oldArray = new ArrayList<>();
        List<Integer> nextArray = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                nextArray.add(1);
                oldArray.add(1);
                System.out.println(1);
                continue;
            }
            if (i == 2) {
                nextArray.add(1);
                oldArray.add(1);
                System.out.println(1 + " " + 1);
                continue;
            }
            if (i > 2) {
                nextArray.add(1);
                for (int j = 1; j < nextArray.size() - 1; j++) {
                    int summedElement = oldArray.get(j) + oldArray.get(j - 1);
                    nextArray.set(j, summedElement);
                }
                oldArray.add(1);
                for (int j = 0; j < nextArray.size(); j++) {
                    System.out.print(nextArray.get(j) + " ");
                    oldArray.set(j, nextArray.get(j));
                }
                System.out.println();
            }
        }
    }
}
