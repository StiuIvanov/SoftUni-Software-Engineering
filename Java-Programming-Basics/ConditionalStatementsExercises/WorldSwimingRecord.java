import java.util.Scanner;

public class WorldSwimingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secFor1Meter = Double.parseDouble(scanner.nextLine());

        double cleanTime = distance * secFor1Meter;
        double delayedTime = Math.floor(distance / 15) * 12.5 + cleanTime;

        if (delayedTime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", delayedTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", delayedTime - worldRecord);
        }



    }
}
