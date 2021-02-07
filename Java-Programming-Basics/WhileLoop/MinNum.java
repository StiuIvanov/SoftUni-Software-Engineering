import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int currentInt = Integer.parseInt(input);
            if (currentInt < min) {
                min = currentInt;
            }
        input = scanner.nextLine();
        }
        System.out.println(min);
    }
}
