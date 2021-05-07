package CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Suit[] suits = Suit.values();
        System.out.println("Card Suits:");
        for (Suit suit : suits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    suit.ordinal(),suit.name());
        }
    }
}
