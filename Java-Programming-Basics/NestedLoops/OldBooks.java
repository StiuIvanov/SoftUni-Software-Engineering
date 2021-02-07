import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int apartmentsPerFloor = Integer.parseInt(scanner.nextLine());
        int curentFloor = floors;
        int counterEven = 0;
        int counterOdd = 0;
        for (; curentFloor >= 1; curentFloor--) {
            for (int j = 0; j < apartmentsPerFloor; j++) {
                if (curentFloor == floors) {
                    System.out.printf("L%d%d ", curentFloor, j);
                    if (j == apartmentsPerFloor - 1) {
                        System.out.printf("\n");
                    }
                } else if (curentFloor % 2 == 0) {
                    counterEven++;
                    System.out.printf("O%d%d ", curentFloor, j);
                    if (j == apartmentsPerFloor - 1) {
                        System.out.printf("\n");
                    }
                } else if (curentFloor % 2 != 0) {
                    counterOdd++;
                    System.out.printf("A%d%d ", curentFloor, j);
                    if (j == apartmentsPerFloor - 1) {
                        System.out.printf("\n");
                    }
                }

            }

        }
    }
}
