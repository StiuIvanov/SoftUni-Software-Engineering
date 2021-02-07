import java.util.Scanner;

public class TimeAndMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursInput = Integer.parseInt(scanner.nextLine());
        int minutesInput = Integer.parseInt(scanner.nextLine());

        int minutesTotal = hoursInput * 60 + minutesInput + 15;
        int minutesDisplay = minutesTotal % 60;
        int hoursDisplay = minutesTotal / 60;

        int hoursDisplayFormat = hoursDisplay % 24;

        /*if (minutesDisplay < 10){
            System.out.printf("%d:0%d", hoursDisplay % 24, minutesDisplay);
        } else {
            System.out.printf("%d:%d", hoursDisplay % 24, minutesDisplay);
        }*/
        System.out.printf("%d:%02d", hoursDisplayFormat, minutesDisplay);


    }
}
