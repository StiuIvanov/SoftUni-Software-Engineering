package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        Rank rank1 = Rank.valueOf(rank);
        Suit suit1 = Suit.valueOf(suit);

        Card card = new Card(rank1,suit1);
        System.out.printf("Card name: %s of %s; Card power: %d",
                card.getRank().name(), card.getSuit().name(), card.getPower());

    }
}
