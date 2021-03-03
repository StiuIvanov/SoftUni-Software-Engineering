import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MagicCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] textInput = scanner.nextLine().split(":");
        List<String> cards = new ArrayList<>();
        List<String> newDeck = new ArrayList<>();

        for (int i = 0; i < textInput.length; i++) {
            cards.add(textInput[i]);
        }

        String readyCommand = scanner.nextLine();
        while (!readyCommand.equals("Ready")) {
            String[] tokens = readyCommand.split(" ");

            switch (tokens[0]) {
                case "Add":
                    if (!cards.contains(tokens[1])) {
                        System.out.println("Card not found.");
                        break;
                    }
                    if (!newDeck.contains(tokens[1])) {
                        newDeck.add(tokens[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!cards.contains(tokens[1]) || index<0 || index>newDeck.size()-1) {
                        System.out.println("Error!");
                        break;
                    }
                    newDeck.add(index, tokens[1]);
                    break;
                case "Remove":
                    if (!cards.contains(tokens[1]) || !newDeck.contains(tokens[1])) {
                        System.out.println("Card not found.");
                        break;
                    }
                    newDeck.remove(tokens[1]);
                    break;
                case "Swap":
                    String cardName1 = tokens[1];
                    String cardName2 = tokens[2];
                    int index1 = newDeck.indexOf(cardName1);
                    int index2 = newDeck.indexOf(cardName2);
                    newDeck.set(index1, cardName2);
                    newDeck.set(index2, cardName1);
                    break;
                case "Shuffle":
                    Collections.reverse(newDeck);
                    break;
            }

            readyCommand = scanner.nextLine();
        }

        for (String s : newDeck) {
            System.out.print(s + " ");
        }

    }
}

