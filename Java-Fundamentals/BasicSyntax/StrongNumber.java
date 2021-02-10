package bg.softuni.fundamentals;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberInput = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < numberInput.length() ; i++) {
            int digit = numberInput.charAt(i) - 48;
            int factorial = 1;
            for (int j = 1; j <= digit ; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        int numberInputDigit = Integer.parseInt(numberInput);
        if (sum== numberInputDigit){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
