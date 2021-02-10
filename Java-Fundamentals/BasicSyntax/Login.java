package bg.softuni.fundamentals;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        int lenght = original.length();
        String reverse = "";
        int counter = 0;
        boolean flag = false;
        for (int i = lenght - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        while (counter < 3) {
            String inputTry = scanner.nextLine();
            counter++;
            if (reverse.equals(inputTry)) {
                flag = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }
        if (flag) {
            System.out.printf("User %s logged in.", original);
        } else {
            System.out.printf("User %s blocked!", original);
        }

    }
}


