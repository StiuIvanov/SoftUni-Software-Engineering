import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int pieces = 0;
        int area = width * lenght;
        while (!command.equals("STOP")) {
            int currentPieces = Integer.parseInt(command);
            pieces += currentPieces;
            if (pieces >= area) {
                int difference = pieces - area;
                System.out.printf("No more cake left! You need %d pieces more.", difference);
                break;
            }
            command = scanner.nextLine();
        }
        if (pieces < area) {
            int difference = area - pieces;
            System.out.printf("%d pieces are left.", difference);
        }
    }
}
