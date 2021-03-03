import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputText = scanner.nextLine().split("\\|");
        List<String> loot = new ArrayList<>();
        for (int i = 0; i < inputText.length; i++) {
            loot.add(inputText[i]);
        }

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Loot":
                    for (int i = 1; i < tokens.length; i++) {
                        if (!loot.contains(tokens[i])) {
                            loot.add(0, tokens[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < loot.size()) {
                        loot.add(loot.get(index));
                        loot.remove(index);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(tokens[1]);
                    List<String> droppedLoot = new ArrayList<>();
                    if (loot.size() < count) {
                        int difference = loot.size() - count;
                        count = count + difference;
                    }
                    for (int i = 0; i < count; i++) {
                        droppedLoot.add(loot.get(loot.size() - 1));
                        loot.remove(loot.size() - 1);
                    }
                    for (int i = 0; i < count; i++) {
                        System.out.print(droppedLoot.get(droppedLoot.size()-1-i));
                        if (i < count - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }

        int sumLength = 0;

        for (int i = 0; i < loot.size(); i++) {
            sumLength += loot.get(i).length();
        }

        double averageGain = sumLength / 1.00 / loot.size();


        if (loot.size() == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", averageGain);
        }
    }
}
