import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] dayName = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday","Sunday"};

        int command = Integer.parseInt(scanner.nextLine());
            if (command>0 && command<8) {
                System.out.println(dayName[command - 1]);
            } else {
                System.out.println("Invalid day!");

            }
    }
}
