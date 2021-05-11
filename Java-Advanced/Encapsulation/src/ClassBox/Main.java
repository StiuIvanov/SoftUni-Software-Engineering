package ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        Box box = new Box(length,width,height);

        printInfo(box);
    }

    private static void printInfo(Box box) {
        System.out.printf("Surface Area - %.2f%n" +
                "Lateral Surface Area - %.2f\n" +
                "Volume – %.2f", box.calculateSurfaceArea(),
                box.calculateLateralSurfaceArea(),
                box.calculateVolume());
    }
}
