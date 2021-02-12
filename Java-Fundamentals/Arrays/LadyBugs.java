import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCellsOfField = Integer.parseInt(scanner.nextLine());
        String[] bugsIndexesCreation = scanner.nextLine().split(" ");
        int[] bugsIndexesIntCreated = new int[bugsIndexesCreation.length];
        for (int i = 0; i < bugsIndexesCreation.length; i++) {
            bugsIndexesIntCreated[i] = Integer.parseInt(bugsIndexesCreation[i]);
        }
        String endCommand = scanner.nextLine();

        int[] bugsHolder = new int[numCellsOfField];
        for (int i = 0; i < bugsIndexesIntCreated.length; i++) {
            bugsHolder[bugsIndexesIntCreated[i]] = 1;
        }

        while (!endCommand.equals("end")) {
            String[] command = endCommand.split(" ");
            int ladybugIndexCommand = Integer.parseInt(command[0]);
            int flyLengthCommand = Integer.parseInt(command[2]);
            int secondFlylengtth = flyLengthCommand;
//right
            if (command[1].equals("right")) {
                if (bugsHolder[ladybugIndexCommand] == 1) {
                    while (true) {
                        if (ladybugIndexCommand + flyLengthCommand > bugsHolder.length - 1) {
                            bugsHolder[ladybugIndexCommand] = 0;
                            break;
                        } else if (bugsHolder[ladybugIndexCommand + flyLengthCommand] == 1) {
                            flyLengthCommand += secondFlylengtth;
                        } else {
                            bugsHolder[ladybugIndexCommand + flyLengthCommand] = 1;
                            bugsHolder[ladybugIndexCommand] = 0;
                            break;
                        }
                    }
                }
            }
//left
            if (command[1].equals("left")) {
                if (bugsHolder[ladybugIndexCommand] == 1) {
                    while (true){
                        if (ladybugIndexCommand- flyLengthCommand <0){
                            bugsHolder[ladybugIndexCommand]=0;
                            break;
                        } else if (bugsHolder[ladybugIndexCommand - flyLengthCommand]==1){
                            flyLengthCommand-=secondFlylengtth;
                        } else  {
                            bugsHolder[ladybugIndexCommand-flyLengthCommand] = 1;
                            bugsHolder[ladybugIndexCommand]=0;
                            break;
                        }
                    }
                }
            }
            endCommand = scanner.nextLine();
        }
        for (int i = 0; i < bugsHolder.length; i++) {
            System.out.print(bugsHolder[i] + " ");
        }
    }
}


