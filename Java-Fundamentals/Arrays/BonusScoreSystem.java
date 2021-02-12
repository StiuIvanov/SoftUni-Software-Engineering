import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonusScoreSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int printAttendances = 0;

        for (int i = 0; i < studentsCount; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = attendances * 1.00 / lecturesCount * (5 + additionalBonus);
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                printAttendances = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", printAttendances);

    }
}
