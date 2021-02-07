import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double averageGrade = 0;
        int grade = 1;
        int failedTimes = 0;
//        for (int i = 1; grade <= 12; i++) {
//            double currentInput = Double.parseDouble(scanner.nextLine());
//            if (currentInput >= 4) {
//                averageGrade += currentInput;
//                grade++;
//            } else {
//                failedTimes++;
//                if (failedTimes >= 2) {
//                    break;
//                }
//                continue;
//            }
//        }
//        averageGrade /= 12;
//        if (grade-1 ==12) {
//            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
//        } else {
//            System.out.printf("%s has been excluded at %d grade", name, grade);
//        }

        while (grade < 13) {
            double currentInput = Double.parseDouble(scanner.nextLine());
            if (currentInput >= 4) {
                averageGrade += currentInput;
                grade++;
            } else {
                failedTimes++;
                if (failedTimes > 1) {
                    break;
                }
                continue;
            }
        }
        averageGrade /= 12;
        if (grade - 1 == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        }
    }
}


