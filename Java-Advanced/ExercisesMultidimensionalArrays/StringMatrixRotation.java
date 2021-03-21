import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotation = Integer.parseInt(scanner.nextLine().split("[()]")[1]) % 360;
        List<String> stringLines = new ArrayList<>();

        int maxSize = 0;
        String line;
        while (!(line = scanner.nextLine()).equals("END")) {
            stringLines.add(line);
            if (line.length() > maxSize) {
                maxSize = line.length();
            }
        }

        int rows = stringLines.size();
        int cols = maxSize;

        char[][] matrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (stringLines.get(r).length() < maxSize && c >= stringLines.get(r).length()) {
                    matrix[r][c] = ' ';
                } else {
                    matrix[r][c] = stringLines.get(r).charAt(c);
                }
            }
        }

        switch (rotation) {
            case 0:
                printRotate0(matrix);
                break;
            case 90:
                printRotate90(matrix);
                break;
            case 180:
                printRotate180(matrix);
                break;
            case 270:
                printRotate270(matrix);
                break;
        }

    }

    private static void printRotate270(char[][] matrix) {
        for (int c = matrix[0].length - 1; c >= 0; c--) {
            for (int r = 0; r < matrix.length; r++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    private static void printRotate180(char[][] matrix) {
        for (int r = matrix.length - 1; r >= 0; r--) {
            for (int c = matrix[r].length - 1; c >= 0; c--) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    public static void printRotate0(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    public static void printRotate90(char[][] matrix) {
        int column = 0;
        while (column != matrix[0].length) {
            for (int r = matrix.length - 1; r >= 0; r--) {
                System.out.print(matrix[r][column]);
            }
            column++;
            System.out.println();
        }
    }


}
