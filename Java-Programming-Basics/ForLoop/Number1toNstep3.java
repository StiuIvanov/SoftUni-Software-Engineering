import java.util.Scanner;

public class Number1toNstep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lastNumber; i += 3) {
            System.out.println(i);
        }
    }
}
