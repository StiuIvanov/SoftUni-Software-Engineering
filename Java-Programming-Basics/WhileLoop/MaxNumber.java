import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String currentInput = scanner.nextLine();
        while (!currentInput.equals("Stop")) {
            int currentNum = Integer.parseInt(currentInput);
            if (currentNum > max) {
                max = currentNum;
            }
            currentInput = scanner.nextLine();
        }
        System.out.println(max);
    }
}
