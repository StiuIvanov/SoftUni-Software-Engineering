import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(n, scanner);

        int sumLeft = sumLeftDiagonal(matrix);
        int sumRight = sumRightDiagonal(matrix);

        int differenceOfDiagonals = Math.abs(sumLeft - sumRight);
        System.out.println(differenceOfDiagonals);

    }

    private static int sumRightDiagonal(int[][] matrix) {
        int sumRightDiagonal = 0;
        for (int r = 0; r < matrix.length; r++) {
                sumRightDiagonal += matrix[r][matrix[r].length-1-r];
        }
        return sumRightDiagonal;
    }

    private static int sumLeftDiagonal(int[][] matrix) {
        int sumLeftDiagonal = 0;
        for (int r = 0; r < matrix.length; r++) {
            sumLeftDiagonal += matrix[r][r];
        }
        return sumLeftDiagonal;
    }

    private static int[][] readMatrix(int n, Scanner scanner) {
        int[][] matrix = new int[n][n];

        for (int r = 0; r < n; r++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[r] = arr;
        }
        return matrix;
    }
}
