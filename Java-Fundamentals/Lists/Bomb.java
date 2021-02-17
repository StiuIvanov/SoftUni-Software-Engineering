import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseLineNumbers(scanner);
        int bomb = Integer.parseInt(String.valueOf(scanner.nextInt()));
        int power = Integer.parseInt(String.valueOf(scanner.nextInt()));
        while (numbers.contains(bomb)) {
            int bombIndex = numbers.indexOf(bomb);

            int leftBound = Math.max(0, bombIndex-power);
            int rightBound = Math.min(numbers.size()-1, bombIndex+power);
            for (int i = leftBound; i <=rightBound ; i++) {
                numbers.remove(leftBound);
            }
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);


    }

    public static List<Integer> parseLineNumbers(Scanner scanner) {
        String[] numbersText = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String s : numbersText) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }

}
