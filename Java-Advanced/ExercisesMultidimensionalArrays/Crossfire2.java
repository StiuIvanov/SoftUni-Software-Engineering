import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][columns];

        int counter = 1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                matrix[r][c] = counter;
                counter++;
            }
        }

        String command;
        while (!(command = scanner.nextLine()).equals("Nuke it from orbit")) {
            int[] cross = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int rowBoom = cross[0];
            int columnBoom = cross[1];
            int radiusBoom = cross[2];

//            if ( radiusBoom<0 ){
//                continue;
//            }
//            if (rowBoom> matrix.length-1 || columnBoom> matrix[rowBoom].length ){
//                continue;
//            }
            // find borders

            int startIndexRow = rowBoom - radiusBoom;
            int endIndexRow = rowBoom + radiusBoom;
            int startIndexCol = columnBoom - radiusBoom;
            int endIndexCol = columnBoom+ radiusBoom;

            if (startIndexRow < 0) {
                startIndexRow = 0;
            }
            if (startIndexCol < 0) {
                startIndexCol = 0;
            }
            if (endIndexRow >matrix.length-1){
                endIndexRow=matrix.length-1;
            }
            if (endIndexCol>matrix[rowBoom].length-1){
                endIndexCol=matrix[rowBoom].length-1;
            }
            if (startIndexRow> matrix.length&&startIndexCol<matrix[rowBoom].length){
                continue;
            }
            //destroy
            if (startIndexRow<matrix.length) {
                for (int r = startIndexRow; r <= endIndexRow; r++) {
                    if (matrix[r].length > columnBoom) {
                        matrix[r][columnBoom] = -1;
                    }
                }
            }
            if (startIndexCol<matrix[rowBoom].length)
            for (int c = startIndexCol; c <= endIndexCol; c++) {
                if (matrix[rowBoom].length-1>=c){
                    matrix[rowBoom][c]= -1;
                }
            }
            //reArrange
            for (int r = 0; r < rows; r++) {
                List<Integer> list = new ArrayList<>();
                for (int c = 0; c < matrix[r].length; c++) {
                    if (matrix[r][c]!= -1){
                        list.add(matrix[r][c]);
                    }
                }
                int[] array = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    array[i]= list.get(i);
                }
                matrix[r]= array;
            }

        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
                if (c<columns-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //print Matrix
    }
}
