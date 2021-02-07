import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        int numBadGrades = 0;
        int numGrades = 0;
        int sumGrades = 0;
        String lastTask = "";
        boolean failed = false;
        String nameOfTask = scanner.nextLine();
        while (!nameOfTask.equals("Enough")) {
            lastTask = nameOfTask;
            int inputGrade = Integer.parseInt(scanner.nextLine());
            numGrades++;
            sumGrades += inputGrade;
            if (inputGrade <= 4) {
                numBadGrades++;
                if (numBadGrades == badGrades) {
                    failed = true;
                    break;
                }
            }
            nameOfTask = scanner.nextLine();
        }
        double gpa = sumGrades * 1.00 / numGrades;
        if (!failed) {
            System.out.printf("Average score: %.2f\n", gpa);
            System.out.printf("Number of problems: %d\n", numGrades);
            System.out.printf("Last problem: %s", lastTask);
        } else {
            System.out.printf("You need a break, %d poor grades.", numBadGrades);
        }
    }
}
