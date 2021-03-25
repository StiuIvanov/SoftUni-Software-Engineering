import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinersTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            String name = command;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resources.containsKey(name)){
                quantity+=resources.get(name);
            }
            resources.put(name,quantity);

            command= scanner.nextLine();
        }

        resources.forEach((k,v) ->{
            System.out.printf("%s -> %d%n", k, v);
        });

    }
}
