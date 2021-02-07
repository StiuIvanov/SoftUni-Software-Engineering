import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (sum < firstNumber) {
            int currentTry = Integer.parseInt(scanner.nextLine());
            sum += currentTry;
        }
        System.out.println(sum);
    }
}
