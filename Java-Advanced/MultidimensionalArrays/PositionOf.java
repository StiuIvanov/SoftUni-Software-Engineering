import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e->Integer.parseInt(e)).toArray();
        int r = tokens[0];
        int c = tokens[1];

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i]= line;
        }

        int numberToFind = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        for (int rows = 0; rows < r; rows++) {
            for (int cols = 0; cols < c; cols++) {
                if (matrix[rows][cols]==numberToFind){
                    System.out.println(rows + " " + cols);
                    isFound = true;
                }
            }
        }

        if (!isFound){
            System.out.println("not found");
        }

    }
}
