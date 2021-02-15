import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")){
            checkPalindrome(command);
            command = scanner.nextLine();
        }
    }

    public static void checkPalindrome(String n) {
        if (n.length() % 2 == 0) {
            for (int i = 0; i < n.length() / 2; i++) {
                int currentFirstDigit = Integer.parseInt(String.valueOf(n.charAt(i)));
                int currentLastDigit = Integer.parseInt(String.valueOf(n.charAt(n.length() - 1 - i)));
                if (currentFirstDigit != currentLastDigit) {
                    System.out.println("false");
                    return;
                }
            }
        } else if (n.length() % 2 == 1) {
            for (int i = 0; i < n.length() / 2 + 1; i++) {
                int currentFirstDigit = Integer.parseInt(String.valueOf(n.charAt(i)));
                int currentLastDigit = Integer.parseInt(String.valueOf(n.charAt(n.length() - 1 - i)));
                if (currentFirstDigit != currentLastDigit) {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
    }


}
