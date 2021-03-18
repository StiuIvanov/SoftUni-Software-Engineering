import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2X2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = tokens[0];
        int columns = tokens[1];

        int[][] matrix = new int[rows][columns];

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int maxIndexRow = 0;
        int maxIndexColumn = 0;
        for (int r = 0; r < rows-1; r++) {
            for (int c = 0; c < columns-1; c++) {
                int current2x2 = matrix[r][c] + matrix[r][c+1] + matrix[r+1][c] + matrix[r+1][c+1];
                if (maxSum<current2x2){
                    maxSum=current2x2;
                    maxIndexRow=r;
                    maxIndexColumn=c;
                }
            }
        }

        System.out.println(matrix[maxIndexRow][maxIndexColumn] + " " + matrix[maxIndexRow][maxIndexColumn+1]);
        System.out.println(matrix[maxIndexRow+1][maxIndexColumn] + " " + matrix[maxIndexRow+1][maxIndexColumn+1]);
        System.out.println(maxSum);
    }
}
