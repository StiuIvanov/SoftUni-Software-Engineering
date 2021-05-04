import java.util.Scanner;

public class Bomb {
    private static int sapperRow = 0;
    private static int sapperCol = 0;
    private static int bombs = 0;
    private static int ifor = 0;
    private static int lenghtCommands=0;
    private static boolean foundALLBOMBSFINAL = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(",");

        lenghtCommands=commands.length;
        char[][] field = new char[fieldSize][];

        for (int i = 0; i < fieldSize; i++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            field[i] = line.toCharArray();

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'B') {
                    bombs++;
                }
            }

            if (line.contains("s")) {
                sapperRow = i;
                sapperCol = line.indexOf('s');
            }
        }

        boolean foundEnd = false;
        boolean foundAllBombs = false;

        for (int i = 0; i < commands.length; i++) {
            ifor=i;
            switch (commands[i]) {
                case "left":
                    foundEnd = move(sapperRow, sapperCol - 1, field);
                    break;
                case "right":
                    foundEnd = move(sapperRow, sapperCol + 1, field);
                    break;
                case "up":
                    foundEnd = move(sapperRow - 1, sapperCol, field);
                    break;
                case "down":
                    foundEnd = move(sapperRow + 1, sapperCol, field);
                    break;
            }

            if (foundEnd) {
                break;
            }
        }

//
             boolean dontPrint = false;
         if ( bombs==0 && !foundALLBOMBSFINAL){
             dontPrint=true;
            System.out.println("Congratulations! You found all bombs!");
        }
//
//        if (bombs!=0&& !foundEnd) {
//            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombs, sapperRow, sapperCol);
//        }


        if (!foundEnd && !dontPrint){
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombs, sapperRow, sapperCol);
        }
    }

    private static boolean move(int newRow, int newCol, char[][] field) {
        if (!validateIndexes(newRow, newCol, field)) {
            return false;
        }

        char newSymbol = field[newRow][newCol];
        if (newSymbol == 'e') {
            field[sapperRow][sapperCol] = '+';
            sapperRow = newRow;
            sapperCol = newCol;
            field[sapperCol][sapperCol] = 's';
            if (bombs==0){
                foundALLBOMBSFINAL=true;
                System.out.println("Congratulations! You found all bombs!");
            } else  {
                System.out.printf("END! %d bombs left on the field%n", bombs);
            }
                return true;

        }
        if (newSymbol == 'B') {
            bombs--;
            System.out.println("You found a bomb!");
            field[sapperRow][sapperCol]='+';
            sapperRow=newRow;
            sapperCol=newCol;
            field[sapperRow][sapperCol]='s';
        } else {
            field[sapperRow][sapperCol] = '+';
            sapperRow = newRow;
            sapperCol = newCol;
            field[sapperCol][sapperCol] = 's';
        }

        return false;

    }

    private static boolean validateIndexes(int newRow, int newCol, char[][] field) {
        return newRow >= 0 && newRow < field.length &&
                newCol >= 0 && newCol < field[0].length;

    }
    public static void printField(char[][] field){
        for (int rows = 0; rows < field.length; rows++) {
            for (int cols = 0; cols < field[0].length; cols++) {
                System.out.print(field[rows][cols]);
            }
            System.out.println();
        }
    }
}
