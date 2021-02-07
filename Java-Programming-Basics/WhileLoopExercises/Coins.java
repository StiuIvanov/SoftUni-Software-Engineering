import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rest = Double.parseDouble(scanner.nextLine());
        rest = Math.round(rest * 100);
        int coins = 0;
        while (rest > 0) {
            if (rest >= 200) {
                coins++;
                rest -= 200;
            } else if (rest >= 100) {
                coins++;
                rest -= 100;
            } else if (rest >= 50) {
                coins++;
                rest -= 50;
            } else if (rest >= 20) {
                coins++;
                rest -= 20;
            } else if (rest >= 10) {
                coins++;
                rest -= 10;
            } else if (rest >= 5) {
                coins++;
                rest -= 5;
            } else if (rest >= 2) {
                coins++;
                rest -= 2;
            } else if (rest >= 1) {
                coins++;
                rest -= 1;
            }
        }
        System.out.println(coins);
    }
}
