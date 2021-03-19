import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);

        List<List<Integer>> matrix = new ArrayList<>();

        int counter = 1;
        for (int r = 0; r < rows; r++) {
            matrix.add(new ArrayList<>());
            for (int c = 0; c < columns; c++) {
                matrix.get(r).add(counter);
                counter++;
            }
        }

        String command;
        while (!(command = scanner.nextLine()).equals("Nuke it from orbit")) {
            int[] cross = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int rowCross = cross[0];
            int columnCross = cross[1];
            int radiusCross = cross[2];

            for (int i = rowCross - radiusCross; i <= rowCross + radiusCross; i++) {
                if (isInRange(i, columnCross, matrix) && i != rowCross) {
                    matrix.get(i).remove(columnCross);
                }
            }

            for (int i = columnCross + radiusCross; i >= columnCross - radiusCross; i--) {
                if (isInRange( rowCross,i, matrix)) {
                matrix.get(rowCross).remove(i);
                }
            }
            matrix.removeIf(List::isEmpty);
        }

        for (int r = 0; r < matrix.size(); r++) {
            for (int c = 0; c < matrix.get(r).size(); c++) {
                System.out.print(matrix.get(r).get(c));
                if (c < columns - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static boolean isInRange(int i, int columnCross, List<List<Integer>> matrix) {
        return i >= 0 && i < matrix.size() && columnCross >= 0 && columnCross < matrix.get(i).size();
    }
}
