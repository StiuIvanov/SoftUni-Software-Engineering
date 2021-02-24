import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int allEmployeesEfficiency = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        int count = 0;
        while (numberOfStudents != 0) {
            count++;

            numberOfStudents = numberOfStudents - allEmployeesEfficiency;
            if (count % 4 == 0) {
                count++;
            }
            if (numberOfStudents < 0) {
                break;
            }
        }
numberOfStudents=count;
        System.out.printf("Time needed: %dh.", numberOfStudents);
    }
}
