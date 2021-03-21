import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int columns = dimensions[1];

        String[][] matrix = new String[rows][columns];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                char first = 'a';
                char second = 'a';
                char third = 'a';

                first+=r;
                second+=c+r;
                third+=r;
                StringBuilder sb= new StringBuilder();
                sb.append(first);
                sb.append(second);
                sb.append(third);

                matrix[r][c]= sb.toString();
            }
        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
