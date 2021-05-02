
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> effects = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> casings = new ArrayDeque<>();
        int[] tokens = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < tokens.length; i++) {
            casings.push(tokens[i]);
        }

        int daturaBombs = 0;
        int cherryBombs = 0;
        int smokeDecoyBombs = 0;
        boolean filledThePouch = false;

        while (!effects.isEmpty() && !casings.isEmpty()) {
            filledThePouch = daturaBombs >= 3 && cherryBombs >= 3 && smokeDecoyBombs >= 3;
            if (filledThePouch) {
                break;
            }
            int effectValue = effects.poll();
            int casingsValue = casings.poll();


            while (true) {
                int sum = effectValue + casingsValue;

                if (sum == 40) {
                    daturaBombs++;
                    break;
                } else if (sum == 60) {
                    cherryBombs++;
                    break;
                } else if (sum == 120) {
                    smokeDecoyBombs++;
                    break;
                } else {
                    casingsValue -= 5;
                    continue;
                }
            }

        }

        if (filledThePouch) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }

        if (effects.isEmpty()) {
            System.out.println("Bomb Effects: empty");
        } else {
            System.out.printf("Bomb Effects: ");
            System.out.println(effects.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", ")));
        }

        if (casings.isEmpty()) {
            System.out.println("Bomb Casings: empty");
        } else {
            System.out.print("Bomb Casings: ");
            System.out.println(casings.stream().map(String::valueOf)
                    .collect(Collectors.joining(", ")));
        }

        System.out.printf("Cherry Bombs: %d%n", cherryBombs);
        System.out.printf("Datura Bombs: %d%n", daturaBombs);
        System.out.printf("Smoke Decoy Bombs: %d%n", smokeDecoyBombs);


    }
}
