import java.util.Scanner;

public class CharatersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        charFromStartToEnd(a, b);
    }

    public static void charFromStartToEnd(char start, char end) {
        for (int i = Math.min(start, end) + 1; i < Math.max(start, end); i++) {
            char current = (char) i;
            System.out.print(current + " ");
        }
    }

}
