import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String home = scanner.nextLine();
        int stepsTotal = 0;
        while (!home.equals("Going home")) {
            int steps = Integer.parseInt(home);
            stepsTotal += steps;
            if (stepsTotal>= 10000) {
                break;
            }
            home = scanner.nextLine();
        }
        if (stepsTotal< 10000) {
            int steps = Integer.parseInt(scanner.nextLine());
                stepsTotal += steps;
            }
        if (stepsTotal >= 10000) {
            int difference = stepsTotal - 10000;
            System.out.printf("Goal reached! Good job!\n");
            System.out.printf("%d steps over the goal!", difference);
        } else {
            int difference = 10000 - stepsTotal;
            System.out.printf("%d more steps to reach goal.", difference);
        }

    }

}
