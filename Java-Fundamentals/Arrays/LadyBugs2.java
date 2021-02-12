import java.util.Scanner;

public class LadyBugs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCellsOfField = Integer.parseInt(scanner.nextLine());
        String[] bugsIndexesCreation = scanner.nextLine().split(" ");
        int[] bugsField = new int[bugsIndexesCreation.length];
        for (int i = 0; i < bugsIndexesCreation.length; i++) {
            bugsField[i] = Integer.parseInt(bugsIndexesCreation[i]);
        }
        String endCommand = scanner.nextLine();

        int[] field = new int[numCellsOfField];
        for (int i = 0; i < bugsField.length; i++) {
            if (bugsField[i] >= 0 && bugsField[i] < field.length)
                field[bugsField[i]] = 1;
        }

        while (!endCommand.equals("end")) {
            String[] command = endCommand.split(" ");
            int index = Integer.parseInt(command[0]);
            int flight = Integer.parseInt(command[2]);
            int secondFlylengtth = flight;
            if (index < 0 || index > field.length - 1 || field[index] == 0){
                endCommand = scanner.nextLine();
                continue;
            }

            if (field[index] == 1) {
                if (command[1].equals("right")) {
                    while (true) {
                        if (index + flight > field.length - 1) {
                            field[index] = 0;
                            break;
                        } else if (field[index + flight] == 1) {
                            flight += secondFlylengtth;
                        } else {
                            field[index + flight] = 1;
                            field[index] = 0;
                            break;
                        }
                    }
                }
                if (command[1].equals("left")) {
                    while (true) {
                        if (index - flight < 0) {
                            field[index] = 0;
                            break;
                        } else if (field[index - flight] == 1) {
                            flight -= secondFlylengtth;
                        } else {
                            field[index - flight] = 1;
                            field[index] = 0;
                            break;
                        }
                    }
                }

            }
            endCommand = scanner.nextLine();
        }

        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
    }
}


