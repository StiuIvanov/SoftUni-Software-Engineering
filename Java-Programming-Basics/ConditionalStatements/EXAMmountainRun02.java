import java.util.Scanner;

public class EXAMmountainRun02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        //***
        double timeDelayInSec =Math.floor(distance / 50) * 30;
        double timeTotal = distance * secondsPerMeter + timeDelayInSec;

        if (timeTotal < record){
            System.out.printf("Yes! The new record is %.2f seconds.", timeTotal);
        } else {
            double timeNeeded = Math.abs(record - timeTotal);
            System.out.printf("No! He was %.2f seconds slower.", timeNeeded);
        }


    }
}
