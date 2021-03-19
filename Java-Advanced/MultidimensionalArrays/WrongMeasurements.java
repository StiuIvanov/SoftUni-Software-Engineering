import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int[] mistakenIndexs = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int mistakenValue = matrix[mistakenIndexs[0]][mistakenIndexs[1]];


        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c]==mistakenValue){
                    int up = r-1;
                    int down = r+1;
                    int left = c-1;
                    int right = c+1;
                    int sum=matrix[r][c]-matrix[r][c];

                    if (up>=0 && matrix[up][c]!=mistakenValue){
                        sum+=matrix[up][c];
                    }
                    if (down<=rows-1 && matrix[down][c] != mistakenValue){
                        sum+=matrix[down][c];
                    }
                    if (left>=0 && matrix[r][left] != mistakenValue){
                        sum+=matrix[r][left];
                    }
                    if (right<=matrix[r].length-1 && matrix[r][right] != mistakenValue){
                        sum+= matrix[r][right];
                    }

                    matrix[r][c]= sum;
                }
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
                if (c< matrix[r].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }

}
