import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryNums = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double sumGradeTotal = 0;
        double currentGrade = 0;
        int countExams = 0;

        while (!command.equals("Finish")) {
            double sumGrade = 0;

            for (int i = 0; i < juryNums ; i++) {
                currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrade += currentGrade;
            }
            double gpa = sumGrade / juryNums;
            System.out.printf("%s - %.2f.\n", command, gpa );
            sumGradeTotal += gpa;
            countExams++;
            command = scanner.nextLine();
        }
        double gpaTotal = sumGradeTotal / countExams;
        System.out.printf("Student's final assessment is %.2f.", gpaTotal);
    }
}
