import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")) {
            double try1 = Double.parseDouble(input);
            if (try1 < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n", try1);
            sum += try1;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
