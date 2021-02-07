import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double gpa = Double.parseDouble(scanner.nextLine());
        double minimalWage = Double.parseDouble(scanner.nextLine());

        double scholarshipSocial = 0;
        double scholarshipPerfect = 0;

        if (budget < minimalWage && gpa > 4.50) {
            scholarshipSocial = minimalWage * 0.35;
        }
        if (gpa >= 5.50) {
            scholarshipPerfect = gpa * 25;
        }

        if (scholarshipPerfect != 0 && scholarshipSocial != 0) { //
            System.out.println(Math.max(scholarshipPerfect, scholarshipSocial));
        } else if (scholarshipPerfect > 0) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarshipPerfect);
        } else if (scholarshipSocial > 0) {
            System.out.printf("You get a Social scholarship %.0f BGN", scholarshipSocial);
        } else {
            System.out.println("You cannot get a scholarship!");
        }


    }
}
