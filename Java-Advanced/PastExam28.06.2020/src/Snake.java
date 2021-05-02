import java.util.Scanner;

public class Snake {
    private static int snakeRow = 0;
    private static int snakeCol = 0;
    private static int food = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();
            if (line.contains("S")) {
                snakeRow = i;
                snakeCol = line.indexOf("S");
            }
        }

        boolean isInTheField = true;

        while (food < 10) {
            String direction = scanner.nextLine();

            switch (direction) {
                case "up":
                    isInTheField = move(field, snakeRow - 1, snakeCol);
                    break;
                case "down":
                    isInTheField = move(field, snakeRow + 1, snakeCol);
                    break;
                case "left":
                    isInTheField = move(field, snakeRow, snakeCol - 1);
                    break;
                case "right":
                    isInTheField = move(field, snakeRow, snakeCol + 1);
                    break;
            }

            if (!isInTheField){
                field[snakeRow][snakeCol]='.';
                System.out.println("Game over!");
                break;
            }
        }

        if (food>=10){
            System.out.println("You won! You fed the snake.");
        }
        System.out.printf("Food eaten: %d%n", food);
        printField(field);
    }

    private static boolean move(char[][] field, int nextRow, int nextCol) {
        if (!validateIsInTheField(field, nextRow, nextCol)) {
            return false;
        }

        char currentSymbol = field[nextRow][nextCol];

        if (currentSymbol=='*'){
            getFood();
        }else if (currentSymbol=='B'){
        field[snakeRow][snakeCol] = '.';
        snakeRow= nextRow;
        snakeCol=nextCol;
        field[snakeRow][snakeCol] = '.';


            for (int rows = 0; rows < field.length; rows++) {
                for (int cols = 0; cols < field[0].length ; cols++) {
                    if (field[rows][cols]=='B'){
                        int secondBurrowRow=rows;
                        int secondBUrrowCol=cols;
                        snakeRow=secondBurrowRow;
                        snakeCol=secondBUrrowCol;
                    }
                }
            }



        field[snakeRow][snakeCol]= 'S';
            return true;

        }else{

        }

        field[snakeRow][snakeCol] = '.';
        snakeRow= nextRow;
        snakeCol=nextCol;
        field[snakeRow][snakeCol]= 'S';
        return true;
    }

    private static void getFood() {
        food++;
    }

    private static boolean validateIsInTheField(char[][] field, int nextRow, int nextCol) {
        return nextRow >= 0 && nextRow < field.length &&
                nextCol >= 0 && nextCol < field[0].length;
    }

    private static void printField(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int cols = 0; cols < field[0].length; cols++) {
                System.out.print(field[row][cols]);
            }
            System.out.println();
        }
    }
}
