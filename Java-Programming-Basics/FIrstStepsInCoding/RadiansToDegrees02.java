import java.util.Scanner;

public class RadiansToDegrees02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radians = Double.parseDouble(scan.nextLine());

        System.out.printf("%.0f", radians * 180/ Math.PI);
    }
}
