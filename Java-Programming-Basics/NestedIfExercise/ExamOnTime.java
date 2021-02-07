import java.util.Scanner;

public class ExamOnTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int minutesExamTotal = hourExam * 60 + minutesExam;
        int minutesArrivalTotal = hourArrival * 60 + minutesArrival;

        if (minutesArrivalTotal > minutesExamTotal) {
            int difference = minutesArrivalTotal - minutesExamTotal;
            int diferenceHour = difference / 60;
            int differenceMinutes = difference % 60;
            if (minutesArrivalTotal >= minutesExamTotal + 60) {
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", diferenceHour, differenceMinutes);
            } else if (minutesArrivalTotal > minutesExamTotal) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", difference);
            }
        } else if (minutesArrivalTotal <= minutesExamTotal && minutesArrivalTotal >= minutesExamTotal - 30){
            int onTimeEarly = minutesExamTotal - minutesArrivalTotal;
            System.out.println("On time");
            if (minutesArrivalTotal != minutesExamTotal) {
                System.out.printf("%d minutes before the start", onTimeEarly);
            }
        } else {
            int differenceHour = (minutesExamTotal - minutesArrivalTotal) / 60;
            int differenceMinutes = (minutesExamTotal - minutesArrivalTotal) % 60;
            System.out.println("Early");
            if (minutesArrivalTotal <= minutesExamTotal - 60 ) {
                System.out.printf("%d:%02d hours before the start", differenceHour, differenceMinutes );
            } else {
                System.out.printf("%d minutes before the start", differenceMinutes);
            }
        }
    }
}
