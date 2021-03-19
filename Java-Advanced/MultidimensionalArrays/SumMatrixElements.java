import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int[] dimensions = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(e-> Integer.parseInt(e)).toArray();

         int[][] matrix = new int[dimensions[0]][dimensions[1]];

        for (int r = 0; r < dimensions[0]; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(e->Integer.parseInt(e)).toArray();
        }

        int sum = 0;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum+=matrix[r][c];
            }
        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }
}
