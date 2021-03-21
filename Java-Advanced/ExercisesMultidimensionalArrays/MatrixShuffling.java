import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = buildMatrix(scanner);

        String command;
        while (!(command = scanner.nextLine()).equals("END")) {
            String[] tokens = command.split("\\s+");
            if (!isValidCommand(tokens, matrix)) {
                System.out.println("Invalid input!");
                continue;
            } else {
                int r1 = Integer.parseInt(tokens[1]);
                int c1 = Integer.parseInt(tokens[2]);
                int r2 = Integer.parseInt(tokens[3]);
                int c2 = Integer.parseInt(tokens[4]);
                String oldElement = matrix[r1][c1];
                matrix[r1][c1] = matrix[r2][c2];
                matrix[r2][c2] = oldElement;
                printMatrix(matrix);
            }
        }

    }

    private static void printMatrix(String[][] matrix) {
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

    private static boolean isValidCommand(String[] tokens, String[][] matrix) {
        if (!tokens[0].equals("swap")) {
            return false;
        }
        if (tokens.length != 5) {
            return false;
        }
        // Check for digit
        int r1 = Integer.parseInt(tokens[1]);
        if (r1 >= matrix.length || r1 < 0) {
            return false;
        }

        int c1 = Integer.parseInt(tokens[2]);
        if (c1 >= matrix[0].length || c1 < 0) {
            return false;
        }

        int r2 = Integer.parseInt(tokens[3]);
        if (r2 >= matrix.length || r2 < 0) {
            return false;
        }

        int c2 = Integer.parseInt(tokens[4]);
        if (c2 >= matrix[0].length || c2 < 0) {
            return false;
        }
        return true;
    }

    private static String[][] buildMatrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[rows][cols];

        for (int r = 0; r < rows; r++) {
            matrix[r] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }
}
