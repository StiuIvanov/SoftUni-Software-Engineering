import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);

        int[][] secondMatrix = readMatrix(scanner);

        System.out.println(compareMatrices(firstMatrix, secondMatrix) ? "equal" : "not equal");
    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int rows = 0; rows < firstMatrix.length; rows++) {
            if (firstMatrix[rows].length != secondMatrix[rows].length) {
                return false;
            }

            for (int cols = 0; cols < firstMatrix[rows].length; cols++) {
                if (firstMatrix[rows][cols] != secondMatrix[rows][cols]) {
                    return false;
                }

            }
        }

        return true;
    }

    public static int[][] readMatrix(Scanner scanner) {
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int rows = input[0];
        int cols = input[1];

        int[][] newMatrix = new int[rows][cols];

        for (int c = 0; c < rows; c++) {
            newMatrix[c] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();
        }

        return newMatrix;
    }

}
