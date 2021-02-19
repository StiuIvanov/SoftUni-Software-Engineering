    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class CardsGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> firstHand = parseLineOfNumbers(scanner);
            List<Integer> secondHand = parseLineOfNumbers(scanner);
            while (!(firstHand.isEmpty() || secondHand.isEmpty())) {
                if (firstHand.get(0).equals(secondHand.get(0))) {
                    firstHand.remove(0);
                    secondHand.remove(0);
                } else if (firstHand.get(0) > secondHand.get(0)) {
                    firstHand.add(firstHand.get(0));
                    firstHand.remove(0);
                    firstHand.add(secondHand.get(0));
                    secondHand.remove(0);
                } else {
                    secondHand.add(secondHand.get(0));
                    secondHand.remove(0);
                    secondHand.add(firstHand.get(0));
                    firstHand.remove(0);
                }
            }
            int sum = 0;
            if (firstHand.isEmpty()) {
                for (int card : secondHand) {
                    sum += card;
                }
                System.out.println("Second player wins! Sum: " + sum);
            } else {
                for (int card : firstHand) {
                sum += card;
                }
                System.out.println("First player wins! Sum: " + sum);
            }
        }

        public static List<Integer> parseLineOfNumbers(Scanner scanner) {
            String[] text = scanner.nextLine().split("\\s+");
            List<Integer> numbers = new ArrayList<>();
            for (String s :
                    text) {
                numbers.add(Integer.parseInt(s));
            }
            return numbers;
        }
    }