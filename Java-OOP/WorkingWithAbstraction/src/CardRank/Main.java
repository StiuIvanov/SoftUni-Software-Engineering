package CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rank[] ranks = Rank.values();
        System.out.println("Card Ranks:");
        for (Rank rank : ranks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    rank.ordinal(), rank.name());
        }
    }
}
