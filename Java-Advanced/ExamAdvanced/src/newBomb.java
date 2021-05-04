import java.util.Scanner;

public class newBomb {
    static int sapperRow = 0;
    static int sapperCol = 0;
    static int allBombs = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfField = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[sizeOfField][sizeOfField];
        String[] commands = scanner.nextLine().split(",");
        for (int i = 0; i < sizeOfField; i++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 's') {
                    sapperRow = i;
                    sapperCol = j;
                }
                if (line.charAt(j) == 'B') {
                    allBombs++;
                }
            }

            field[i] = line.toCharArray();
        }


        boolean foundE = false;
        boolean foundAllBombs = false;
        for (int i = 0; i < commands.length; i++) {

            switch (commands[i]) {
                case "left":
                    if (hitWall(sapperRow, sapperCol - 1, field)) {
                        break;
                    }
                    int symbol = field[sapperRow][sapperCol - 1];
                    if (symbol == 'e') {
                        foundE = true;
                        break;
                    } else if (symbol == 'B') {
                        allBombs--;
                        System.out.println("You found a bomb!");
                        if (allBombs == 0) {
                            foundAllBombs = true;
                            break;
                        }
                    }
                    field[sapperRow][sapperCol] = '+';
                    sapperCol -= 1;
                    field[sapperRow][sapperCol] = 's';
                    break;
                case "right":
                    if (hitWall(sapperRow, sapperCol + 1, field)) {
                        break;
                    }
                    symbol = field[sapperRow][sapperCol + 1];
                    if (symbol == 'e') {
                        foundE = true;
                        break;
                    } else if (symbol == 'B') {
                        allBombs--;
                        System.out.println("You found a bomb!");
                        if (allBombs == 0) {
                            foundAllBombs = true;
                            break;
                        }
                    }
                    field[sapperRow][sapperCol] = '+';
                    sapperCol += 1;
                    field[sapperRow][sapperCol] = 's';
                    break;
                case "up":
                    if (hitWall(sapperRow - 1, sapperCol, field)) {
                        break;
                    }
                    symbol = field[sapperRow - 1][sapperCol];
                    if (symbol == 'e') {
                        foundE = true;
                        break;
                    } else if (symbol == 'B') {
                        System.out.println("You found a bomb!");
                        allBombs--;
                        if (allBombs == 0) {
                            foundAllBombs = true;
                            break;
                        }
                    }
                    field[sapperRow][sapperCol] = '+';
                    sapperRow -= 1;
                    field[sapperRow][sapperCol] = 's';
                    break;
                case "down":
                    if (hitWall(sapperRow + 1, sapperCol, field)) {
                        break;
                    }
                    symbol = field[sapperRow + 1][sapperCol];
                    if (symbol == 'e') {
                        foundE = true;
                        break;
                    } else if (symbol == 'B') {
                        System.out.println("You found a bomb!");
                        allBombs--;
                        if (allBombs == 0) {
                            foundAllBombs = true;
                            break;
                        }
                    }
                    field[sapperRow][sapperCol] = '+';
                    sapperRow += 1;
                    field[sapperRow][sapperCol] = 's';
                    break;
            }
            if (foundE) {
                break;
            }

        }

        if (foundE){
            System.out.printf("END! %d bombs left on the field%n",allBombs);
        }else if (foundAllBombs){
            System.out.printf("Congratulations! You found all bombs!%n");
        }else{
            System.out.printf( "%d bombs left on the field. Sapper position: (%d,%d)",allBombs,sapperRow,sapperCol);
        }



    }

    private static boolean hitWall(int newRow, int newCol, char[][] field) {

        return !(newRow >= 0 && newRow < field.length & newCol >= 0 && newCol < field[0].length);
    }
}
