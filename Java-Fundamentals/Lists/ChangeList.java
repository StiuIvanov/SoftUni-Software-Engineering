import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseLineOfNumbers(scanner);
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] operator = command.split("\\s+");
            switch (operator[0]) {
                case "Delete":
                    int numberToDelete = Integer.parseInt(operator[1]);
                    for (int i = 0; i < numbers.size() ; i++) {
                        if (numberToDelete==numbers.get(i)){
                            numbers.remove(i);
                            i--;
                        }
                    }

                    break;
                case "Insert":
                    int index = Integer.parseInt(operator[2]);
                    int value = Integer.parseInt(operator[1]);
                    if (index<numbers.size()){
                        numbers.add(index, value);
                    }
                    break;
            }


            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] s = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            int currentNumber = Integer.parseInt(s[i]);
            numbers.add(currentNumber);
        }
        return numbers;
    }

}
