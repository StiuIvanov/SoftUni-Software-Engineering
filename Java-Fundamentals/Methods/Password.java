import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.nextLine();
        boolean isCorrect = true;
        if (!passwordLength(inputPassword)) {
            System.out.println("Password must be between 6 and 10 characters");
            isCorrect = false;
        }

        if (!passwordLettersAndDigits(inputPassword)) {
            System.out.println("Password must consist only of letters and digits");
            isCorrect = false;
        }

        if (!passwordTwoDigits(inputPassword)) {
            System.out.println("Password must have at least 2 digits");
            isCorrect = false;

        }

        if (isCorrect) {
            System.out.println("Password is valid");
        }

    }

    public static boolean passwordLength(String text) {
        if (text.length() >= 6 && text.length() <= 10) {
            return true;
        }

        return false;
    }

    public static boolean passwordLettersAndDigits(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!(text.charAt(i) >= 48 && text.charAt(i) <= 57 || text.charAt(i) >= 65 && text.charAt(i) <= 90 || text.charAt(i) >= 97 && text.charAt(i) <= 122)) {
                return false;
            }

        }

        return true;
    }

    public static boolean passwordTwoDigits(String text) {
        int counterDigits = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 48 && text.charAt(i) <= 57) {
                counterDigits++;
                if (counterDigits >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
