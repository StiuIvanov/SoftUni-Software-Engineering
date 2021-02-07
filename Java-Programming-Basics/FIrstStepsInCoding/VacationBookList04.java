import java.util.Scanner;

public class VacationBookList04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfPages = Integer.parseInt(scan.nextLine());
        int pagesPerHour= Integer.parseInt(scan.nextLine());
        int numOfDays = Integer.parseInt(scan.nextLine());


        int numOfHoursNeeded = numOfPages / numOfDays / pagesPerHour;
        System.out.println(numOfHoursNeeded);
    }
}
