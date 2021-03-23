import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Voina_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        boolean haveWinner = false;

        for (int i = 0; i < 50; i++) {
            int firstNumber = firstDeck.iterator().next();
            int secondNumber = secondDeck.iterator().next();

            firstDeck.remove(firstNumber);
            secondDeck.remove(secondNumber);

            if (firstNumber > secondNumber) {
                secondDeck.add(firstNumber);
                secondDeck.add(secondNumber);
            } else {
                firstDeck.add(firstNumber);
                firstDeck.add(secondNumber);
            }
//            if (firstDeck.isEmpty()) {
//                System.out.println("First player win!");
//                haveWinner = true;
//                break;
//            } else if (secondDeck.isEmpty()) {
//                System.out.println("Second player win!");
//                haveWinner = true;
//                break;
//            }
        }
        if (firstDeck.size()== secondDeck.size()) {
            System.out.println("Draw!");
        } else if (firstDeck.size()> secondDeck.size() ){
            System.out.println("First player win!");
        } else {
            System.out.println("Second player win!");
        }
    }
}
