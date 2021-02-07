import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double pointsSum = 0;
        int redCounter = 0;
        int orangeCounter = 0;
        int yellowCounter = 0;
        int whiteCounter = 0;
        int defaultCounter = 0;
        int blackCounter = 0;
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            switch (input) {
                case "red":
                    redCounter++;
                    pointsSum += 5;
                    break;
                case "orange":
                    orangeCounter++;
                    pointsSum += 10;
                    break;
                case "yellow":
                    yellowCounter++;
                    pointsSum += 15;
                    break;
                case "white":
                    whiteCounter++;
                    pointsSum += 20;
                    break;
                case "black":
                    blackCounter++;
                    pointsSum /= 2;
                    break;
                default:
                    defaultCounter++;
                    break;
            }
        }
        System.out.printf("Total points: %.0f\n", Math.floor(pointsSum));
        System.out.printf("Points from red balls: %d\n", redCounter);
        System.out.printf("Points from orange balls: %d\n", orangeCounter);
        System.out.printf("Points from yellow balls: %d\n", yellowCounter);
        System.out.printf("Points from white balls: %d\n", whiteCounter);
        System.out.printf("Other colors picked: %d\n", defaultCounter);
        System.out.printf("Divides from black balls: %d", blackCounter);
    }
}
