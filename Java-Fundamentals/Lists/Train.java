import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = parseLineOfNumbers(scanner);
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            if (command[0].equals("Add")) {
                int newWagon = Integer.parseInt(command[1]);
                wagons.add(newWagon);
            } else {
                int waitingPassengers = Integer.parseInt(command[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (waitingPassengers + wagons.get(i) <= maxCapacity) {
                        wagons.set(i, waitingPassengers + wagons.get(i));
                        break;
                    }
                }
            }

            command = scanner.nextLine().split(" ");
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }

    public static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] inputString = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : inputString) {
            int currentNumber = Integer.parseInt(s);
            numbers.add(currentNumber);
        }
        return numbers;
    }


}
