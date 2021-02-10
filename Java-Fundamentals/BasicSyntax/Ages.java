package bg.softuni.fundamentals;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int inputNumber = Integer.parseInt(input);
        if (inputNumber <= 2) {
            System.out.println("baby");
        } else if (inputNumber <= 13) {
            System.out.println("child");
        } else if (inputNumber <= 19) {
            System.out.println("teenager");
        } else if (inputNumber <= 65) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
    }
}
