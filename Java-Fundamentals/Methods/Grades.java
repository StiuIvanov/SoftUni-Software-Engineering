import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      gradeName(Double.parseDouble(scanner.nextLine()));
    }
    public static void gradeName (double grade) {
        if (grade >= 2.00 && grade < 3) {
            System.out.println("Fail");
        } else if (3<= grade && grade <3.5){
            System.out.println("Poor");
        } else if (3.50<= grade && grade <4.5){
            System.out.println("Good");
        } else if (4.50<= grade && grade < 5.5){
            System.out.println("Very good");
        } else if (grade<=6){
            System.out.println("Excellent");
        }
    }
}
