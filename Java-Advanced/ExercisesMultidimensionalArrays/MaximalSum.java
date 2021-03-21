import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(dimensions[0]);
        int m = Integer.parseInt(dimensions[1]);

        int[][] matrix = readMatrix(n, m, scanner);

        int maximalSum = Integer.MIN_VALUE;
        int maxIndexRow = -1;
        int maxIndexCol = -1;
        for (int r = 0; r < n-2; r++) {
            for (int c = 0; c < m-2; c++) {
                int currentMatrixSum = sum3x3Matrix(matrix,r,c);
                if (currentMatrixSum>maximalSum){
                    maximalSum=currentMatrixSum;
                    maxIndexRow=r;
                    maxIndexCol=c;
                }
            }
        }

        System.out.printf("Sum = %d%n", maximalSum);
        print3x3Matrix(matrix, maxIndexRow,maxIndexCol);

    }

    private static void print3x3Matrix(int[][] matrix, int maxIndexRow, int maxIndexCol) {
        for (int r = maxIndexRow; r <maxIndexRow+3; r++) {
            for (int c = maxIndexCol; c < maxIndexCol + 3; c++) {
                System.out.print(matrix[r][c]);
                if (c<maxIndexCol+2){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static int sum3x3Matrix(int[][] matrix, int row, int col) {
        int sum = 0;
        for (int r = row; r < row+3; r++) {
            for (int c = col; c < col+3; c++) {
                sum+= matrix[r][c];
            }
        }

        return sum;
    }

    private static int[][] readMatrix(int n, int m, Scanner scanner) {
        int[][] matrix = new int[n][m];

        for (int r = 0; r < n; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(e->Integer.parseInt(e)).toArray();
        }
        return matrix;
    }
}
