package Cooking01;

import java.util.Arrays;
import java.util.Scanner;

public class Selling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] bakery = new char[n][];
        for (int i = 0; i < n; i++) {
            bakery[i] = scanner.nextLine().toCharArray();
        }

        int[] myPosition = findMyPosition(bakery);
        int myRowPosition = myPosition[0];
        int myColPosition = myPosition[1];

        int money = 0;

        boolean isOut = false;

        String command = scanner.nextLine();
        while (money < 50) {
            bakery[myRowPosition][myColPosition]= '-';
            int[] indexToMove = moveTo(myRowPosition, myColPosition, command);
            myRowPosition = indexToMove[0];
            myColPosition = indexToMove[1];

            if (outOfBakery(bakery, myRowPosition, myColPosition)) {
                isOut = true;
                break;
            }

            char currentChar = bakery[myRowPosition][myColPosition];
            if (currentChar == 'O') {
                bakery[myRowPosition][myColPosition]= '-';
                int[] secondPilarIndex = foundPillar(myRowPosition, myColPosition, bakery);
                myRowPosition = secondPilarIndex[0];
                myColPosition = secondPilarIndex[1];
            } else if (Character.isDigit(currentChar)){
                int collectedMoney = collectMoneyFromNewPosition(myRowPosition, myColPosition, bakery);
                money += collectedMoney;
            }else{

            }

            bakery[myRowPosition][myColPosition] = 'S';

            if (money>=50){
                break;
            }
            command = scanner.nextLine();
        }

        if (isOut) {
            System.out.println("Bad news, you are out of the bakery.");
        } else if (money >= 50) {
            System.out.println("Good news! You succeeded in collecting enough money!");
        }

        System.out.printf("Money: %d%n", money);

        printMatrix(bakery);

    }

    private static void printMatrix(char[][] bakery) {
        for (int i = 0; i < bakery.length; i++) {
            for (int j = 0; j < bakery[0].length; j++) {
                System.out.print(bakery[i][j]);
            }
            System.out.println();
        }

    }

    private static int[] foundPillar(int myRowPosition, int myColPosition, char[][] bakery) {
        for (int i = 0; i < bakery.length; i++) {
            for (int j = 0; j < bakery[0].length; j++) {
                char currentChar = bakery[i][j];
                if (currentChar == 'O') {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    private static int collectMoneyFromNewPosition(int myRowPosition, int myColPosition, char[][] bakery) {
        char current = bakery[myRowPosition][myColPosition];

        if (current == '-') {
            return 0;
        } else {
            return Integer.parseInt(String.valueOf(current));
        }
    }

    private static boolean outOfBakery(char[][] bakery, int newRow, int newCol) {
        return newRow > bakery.length - 1 || newRow < 0
                || newCol > bakery[0].length - 1 || newCol < 0;
    }

    private static int[] moveTo(int myRowPosition, int myColPosition, String command) {
        switch (command) {
            case "up":
                myRowPosition -= 1;
                break;
            case "down":
                myRowPosition += 1;
                break;
            case "left":
                myColPosition -= 1;
                break;
            case "right":
                myColPosition += 1;
                break;
        }
        return new int[]{myRowPosition, myColPosition};
    }


    private static int[] findMyPosition(char[][] bakery) {
        int rows = bakery.length;
        int cols = bakery[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (bakery[i][j] == 'S') {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
