package JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[][] galaxy;
    private static long sumStars;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        galaxy = createGalaxy(scanner);

        fillGalaxyWithStars();

        String command = readCommand(scanner);

        while (commandDoesntMatch(command)) {
            int[] ivoCoordinates = readCoordinates(command);
            int[] evilCoordinates = readCoordinates(scanner.nextLine());

            evilsTurn(evilCoordinates);

            ivosTurn(ivoCoordinates);

            command = readCommand(scanner);
        }

        printSumStars();


    }

    private static void printSumStars() {
        System.out.println(sumStars);
    }

    private static boolean commandDoesntMatch(String command) {
        return !command.equals("Let the Force be with you");
    }

    private static String readCommand(Scanner scanner) {
        String command = scanner.nextLine();
        return command;
    }

    private static void ivosTurn(int[] ivoCoordinates) {
        while (isValidIvoStartLocation(ivoCoordinates)) {
            if (isInRange(ivoCoordinates)) {
                gatherStar(ivoCoordinates);
            }
                ivoCoordinates = moveIvoToDiagonal(ivoCoordinates);
        }
    }

    private static boolean isValidIvoStartLocation(int[] ivoCoordinates) {
        return ivoCoordinates[0]>= 0 && ivoCoordinates[1]< galaxy[0].length;
    }

    private static void evilsTurn(int[] evilCoordinates) {
        while (isValidEvilStartLocation(evilCoordinates)) {
            if (isInRange(evilCoordinates)){
            destroyStar(evilCoordinates);
            }
            evilCoordinates = moveEvilToDiagonal(evilCoordinates);
        }
    }

    private static boolean isValidEvilStartLocation(int[] evilCoordinates) {
        return evilCoordinates[0]>=0 && evilCoordinates[1]>=0;
    }

    private static int[] moveIvoToDiagonal(int[] ivoCoordinates) {
        int newRow = ivoCoordinates[0]-1;
        int newCol  = ivoCoordinates[1]+1;
        return new int[]{newRow,newCol};
    }

    private static void gatherStar(int[] ivoCoordinates) {
        sumStars += galaxy[ivoCoordinates[0]][ivoCoordinates[1]];
    }

    private static void destroyStar(int[] coordinates) {
        galaxy[coordinates[0]][coordinates[1]] = 0;
    }

    private static int[] moveEvilToDiagonal(int[] evilCoordinates) {
        int newRow = evilCoordinates[0]-1;
        int newCol = evilCoordinates[1]-1;
        return new int[]{newRow,newCol};
    }


    private static boolean isInRange(int[] coordinates) {
        int row = coordinates[0];
        int col = coordinates[1];
        return row >= 0 && row < galaxy.length && col >= 0 && col < galaxy[0].length;
    }

    private static void fillGalaxyWithStars() {
        int value = 0;
        for (int i = 0; i < galaxy.length; i++) {
            for (int j = 0; j < galaxy[0].length; j++) {
                galaxy[i][j] = value++;
            }
        }
    }

    private static int[][] createGalaxy(Scanner scanner) {
        int[] dimensions = readCoordinates(scanner.nextLine());
        int x = dimensions[0];
        int y = dimensions[1];
        return new int[x][y];
    }

    private static int[] readCoordinates(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
