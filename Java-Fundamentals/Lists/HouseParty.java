import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayList<String> listNames = new ArrayList<>();
        for (int i = 0; i < numberOfCommands; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            switch (tokens.length) {
                case 3:
                    if (listNames.contains(tokens[0])) {
                        System.out.printf("%s is already in the list!%n", tokens[0]);
                    } else {
                        listNames.add(tokens[0]);
                    }
                    break;
                case 4:
                    if (listNames.contains(tokens[0])) {
                        listNames.remove(tokens[0]);
                    } else {
                        System.out.printf("%s is not in the list!%n", tokens[0]);
                    }
                    break;
            }
        }
        for (String name : listNames) {
            System.out.println(name);
        }
    }
}
