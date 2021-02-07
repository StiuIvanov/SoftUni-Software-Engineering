import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String bestPlayer = "";
        int maxGoals = Integer.MIN_VALUE;
        while (!command.equals("END")) {
           int numberGoals = Integer.parseInt(scanner.nextLine());
            if (numberGoals>maxGoals) {
                maxGoals=numberGoals;
                bestPlayer = command;
            }
            if (numberGoals>=10){
                break;
            }
            command= scanner.nextLine();
        }
        System.out.printf("%s is the best player!\n", bestPlayer);
        if (maxGoals>=3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else  {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
