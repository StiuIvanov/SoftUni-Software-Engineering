import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][columns];
        char[][] secondMatrix = new char[rows][columns];

        for (int r = 0; r < rows; r++) {
            char[] chars = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
            firstMatrix[r] =chars;
        }
        for (int r = 0; r < rows; r++) {
            secondMatrix[r] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                System.out.print(firstMatrix[r][c]==secondMatrix[r][c] ? firstMatrix[r][c] : "*");
                if (c<columns-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
