import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> registerMAP = new TreeMap<>();

        String commandEnd = scanner.nextLine();
        while (!commandEnd.equals("End")) {
            String[] tokens = commandEnd.split(" -> ");
            String name = tokens[0];
            String id = tokens[1];

            if (!registerMAP.containsKey(name)) {
                registerMAP.put(name, new ArrayList<>(Arrays.asList(id)));
            } else {
                if (!registerMAP.get(name).contains(id)){
                registerMAP.get(name).add(id);
                }
            }

            commandEnd = scanner.nextLine();
        }

        registerMAP
                .entrySet()
                .stream()
                .forEach(e-> {
                    System.out.println(e.getKey());
                    e.getValue()
                            .stream()
                            .forEach(s-> System.out.println("-- " + s));
                });

    }
}
