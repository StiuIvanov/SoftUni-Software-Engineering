import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", "))) ;
        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] tokens = command.split(" - ");
            switch (tokens[0]) {
                case "Collect":
                    if (items.contains(tokens[1])) {
                    } else {
                        items.add(tokens[1]);
                    }
                    break;
                case "Drop":
                    if (items.contains(tokens[1])) {
                        items.remove(tokens[1]);
                    }
                    break;
                case "Combine Items":
                    String[] combineItems = tokens[1].split(":");
                    if (items.contains(combineItems[0])){
                        int index = items.indexOf(combineItems[0]);
                        items.add(index+1, combineItems[1]);
                    }
                    break;
                case "Renew":
                    String currentElement = tokens[1];
                    items.remove(items.indexOf(currentElement));
                    items.add(currentElement);
                    break;
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < items.size() ; i++) {
            System.out.print(items.get(i));
            if (i<items.size()-1){
                System.out.print(", ");
            }
        }
    }
}
