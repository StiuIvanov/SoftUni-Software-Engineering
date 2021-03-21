import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(",\\s+");
        int n = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];

        int[][] matrix = new int[n][n];

        matrix= buildMatrix(n,matrix,pattern);
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
                if (c<matrix[r].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] buildMatrix(int n, int[][] matrix, String pattern) {
        if (pattern.equals("A")) {
            int number = 1;
            for (int c = 0; c < n; c++) {
                for (int r = 0; r < n; r++) {
                    matrix[r][c] = number;
                    number++;
                }
            }
            return matrix;
        } else {
            int number = 1;
            while (number != n * n + 1) {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < n; j++) {
                            matrix[j][i] = number;
                            number++;
                        }
                    } else {
                        for (int j = n-1; j >= 0; j--) {
                            matrix[j][i] = number;
                            number++;
                        }
                    }
                }
            }
            return matrix;
        }
    }
}