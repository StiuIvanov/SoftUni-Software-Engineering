import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> handsPower = new LinkedHashMap<>();
        Map<String, Integer> handsPowerIntegers = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
//            Set<String> currentHand = new HashSet<>();
            String[] tokens = input.split(": ");
            String name = tokens[0];
            String[] cards = tokens[1].split(", ");

            if (!handsPower.containsKey(name)) {
                Set<String> newSet = new HashSet<>();
                handsPower.put(name,newSet);
            }
            for (int i = 0; i < cards.length; i++) {
                    handsPower.get(name).add(cards[i]);
                }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> stringSetEntry : handsPower.entrySet()) {
            String name = stringSetEntry.getKey();
            int value = calculateValue(stringSetEntry.getValue());
            handsPowerIntegers.put(name, value);
        }

        handsPowerIntegers.forEach((k, v) -> {
            System.out.printf("%s: %d%n", k, v);
        });


    }

    private static int calculateValue(Set<String> value) {
        int sum = value.stream().mapToInt(HandsOfCards::returntValue).sum();
        return sum;


    }

    private static int returntValue(String e) {
        int power = 0;
        int sum = 0;
        if (Character.isDigit(e.charAt(0))) {
            if (e.charAt(0) == '1') {
                power = Integer.parseInt(e.substring(0, 2));
            } else {
                power = Integer.parseInt(String.valueOf(e.charAt(0)));
            }
        } else {
            switch (e.charAt(0)) {
                case 'J':
                    power = 11;
                    break;
                case 'Q':
                    power = 12;
                    break;
                case 'K':
                    power = 13;
                    break;
                case 'A':
                    power = 14;
                    break;
            }
        }

        int multiplier = 0;
        switch (e.charAt(e.length() - 1)) {
            case 'S':
                multiplier = 4;
                break;
            case 'H':
                multiplier = 3;
                break;
            case 'D':
                multiplier = 2;
                break;
            case 'C':
                multiplier = 1;
                break;
        }

        return power * multiplier;
    }
}
