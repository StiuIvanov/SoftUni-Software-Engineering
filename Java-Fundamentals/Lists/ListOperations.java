import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseLineOfNumbers(scanner);
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] operations = command.split("\\s+");
            String action = operations[0];
            switch (action) {
                case "Add":
                    int value = Integer.parseInt(operations[1]);
                    numbers.add(value);
                    break;
                case "Insert":
                    int index = Integer.parseInt(operations[2]);
                    if (index>numbers.size()-1 || index< 0){
                        System.out.println("Invalid index");
                    } else {
                        int valueInsert = Integer.parseInt(operations[1]);
                        numbers.add(index, valueInsert);
                    }
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(operations[1]);
                    if (indexRemove>numbers.size()-1 || indexRemove<0 ){
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(indexRemove);
                    }
                    break;
                case "Shift":
                    int countTimes = Integer.parseInt(operations[2]);
                    if (operations[1].equals("left")) {
                        for (int i = 0; i <countTimes ; i++) {
                            int zeroIndex = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(zeroIndex);
                        }
                    } else {
                        for (int i = 0; i < countTimes ; i++) {
                            int lastIndex = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.get(numbers.size() - 1));
                            numbers.add(0, lastIndex);
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (Integer num : numbers) {
            System.out.print(num+" ");
        }
    }

    public static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] text = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String word : text) {
            numbers.add(Integer.parseInt(word));
        }
        return numbers;
    }

}
