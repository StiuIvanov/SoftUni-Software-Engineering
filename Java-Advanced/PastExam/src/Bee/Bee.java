package Bee;

import java.util.Scanner;

public class Bee {
    private static int beeRow = 0;
    private static int beeCol = 0;
    private static String direction = "";
    private static boolean isInTerritory = true;
    private static int polinatedFlowers = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] territory = new char[n][];

        for (int rows = 0; rows < n; rows++) {
            String chars = scanner.nextLine();
            if (chars.contains("B")) {
                beeRow = rows;
                beeCol = chars.indexOf("B");
            }
            territory[rows] = chars.toCharArray();
        }


        direction = "";
        while (!(direction = scanner.nextLine()).equals("End")) {

            isInTerritory = moveLogic(territory);

            if (!isInTerritory) {
                territory[beeRow][beeCol] = '.';
                System.out.println("The bee got lost!");
                break;
            }
            printMatrix(territory);
        }

        if (polinatedFlowers < 5) {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - polinatedFlowers);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", polinatedFlowers);
        }

        printMatrix(territory);

    }

    private static boolean moveLogic(char[][] territory) {
        switch (direction) {
            case "up":
                isInTerritory = moveBee(beeRow - 1, beeCol, territory, direction);
                break;
            case "down":
                isInTerritory = moveBee(beeRow + 1, beeCol, territory, direction);
                break;
            case "left":
                isInTerritory = moveBee(beeRow, beeCol - 1, territory, direction);
                break;
            case "right":
                isInTerritory = moveBee(beeRow, beeCol + 1, territory, direction);
                break;
        }
        return isInTerritory;
    }


    private static boolean moveBee(int newBeeRow, int newBeeCol, char[][] territory, String direction) {
        if (!isValidIndexes(newBeeRow, newBeeCol, territory)) {
            return false;
        }

        char newSymbol = territory[newBeeRow][newBeeCol];

        switch (newSymbol) {
            case 'f':
                polinateFlower();
                break;
            case 'O':
                territory[newBeeRow][newBeeCol] = 'B';
                territory[beeRow][beeCol] = '.';
                beeRow = newBeeRow;
                beeCol = newBeeCol;
                moveLogic(territory);
                return true;
            case '.':
                break;
        }

        territory[beeRow][beeCol] = '.';
        beeRow = newBeeRow;
        beeCol = newBeeCol;
        territory[beeRow][beeCol] = 'B';

        return true;
    }

    private static void polinateFlower() {
        polinatedFlowers++;
    }


    private static void printMatrix(char[][] territory) {
        for (int rows = 0; rows < territory.length; rows++) {
            for (int cols = 0; cols < territory[0].length; cols++) {
                System.out.print(territory[rows][cols]);
            }
            System.out.println();
        }
    }

    private static boolean isValidIndexes(int newBeeRow, int newBeeCol, char[][] territory) {
        return newBeeRow >= 0 && newBeeRow < territory.length &&
                newBeeCol >= 0 && newBeeCol < territory[0].length;
    }
}
