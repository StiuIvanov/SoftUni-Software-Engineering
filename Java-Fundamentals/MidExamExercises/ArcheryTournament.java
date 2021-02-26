import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArcheryTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textInput = scanner.nextLine().split("\\|");
        int[] field = new int[textInput.length];
        int archersPoints = 0;
        for (int i = 0; i < field.length; i++) {
            field[i] = Integer.parseInt(textInput[i]);
        }

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("Game")) {

            if (command[0].equals("Reverse")) {
                for (int i = 0; i <field.length/2 ; i++) {
                    int oldElement = field[i];
                    field[i] = field[field.length-1-i];
                    field[field.length-1-i]= oldElement;
                }

                command = scanner.nextLine().split(" ");
                continue;
            }
            String[] tokens = command[1].split("@");
            String direction = tokens[0];
            int indexStart = Integer.parseInt(tokens[1]);
            int length = Integer.parseInt(tokens[2]);

            if (indexStart > field.length - 1 || indexStart < 0) {
                command = scanner.nextLine().split(" ");
                continue;
            }

            int landIndex;
            if (direction.equals("Left")) {
                landIndex = indexStart - length;
                if (landIndex < 0) {
                    int newLandIndex = field.length + landIndex;
                    landIndex = newLandIndex;
                }

            } else {
                landIndex = indexStart + length;
                if (landIndex > field.length - 1) {
                    int overTheBoard = -1 * (field.length - indexStart);
                    int newLandIndex = overTheBoard + length;
                    landIndex = newLandIndex;
                }
            }
            if (field[landIndex] < 5) {
                archersPoints += field[landIndex];
                field[landIndex] = 0;
            } else {
                field[landIndex] -= 5;
                archersPoints += 5;
            }


            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i <field.length ; i++) {
            System.out.print(field[i]);
            if (i<field.length-1){
                System.out.print(" - ");
            }
        }

        System.out.println();
        System.out.printf("Iskren finished the archery tournament with %d points!", archersPoints);

    }
}

