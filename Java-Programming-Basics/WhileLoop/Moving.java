import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int cube = width * lenght * height;
        String finishLineDone = scanner.nextLine();
        int sumBoxes = 0;
        while (!finishLineDone.equals("Done")) {
            int numBoxes = Integer.parseInt(finishLineDone);
            sumBoxes += numBoxes;
            if (sumBoxes >= cube) {
                int difference = sumBoxes - cube;
                System.out.printf("No more free space! You need %d Cubic meters more.", difference);
                break;
            }
            finishLineDone = scanner.nextLine();
        }
        if (finishLineDone.equals("Done")) {
            int difference = cube - sumBoxes;
            System.out.printf("%d Cubic meters left.", difference);
        }
    }
}
