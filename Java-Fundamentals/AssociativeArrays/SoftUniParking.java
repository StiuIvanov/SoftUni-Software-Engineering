import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> registerMAP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");
            String command = inputTokens[0];
            String name = inputTokens[1];

            if (command.equals("register")) {
                if (registerMAP.containsKey(name)) {
                    System.out.println("ERROR: already registered with plate number " + registerMAP.get(name));
                } else {
                    String licensePlateNumber = inputTokens[2];
                    registerMAP.put(name, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", name, registerMAP.get(name));
                }

            } else {
                if (!registerMAP.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n", name);
                }else{
                    System.out.printf("%s unregistered successfully%n", name);
                    registerMAP.remove(name);
                }
            }
        }

        registerMAP
                .entrySet()
                .stream()
                .forEach(e -> System.out.println(String.format("%s => %s", e.getKey(), e.getValue())));
    }
}
