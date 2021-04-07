import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Predicate<String>> predicates = new HashMap<>();

        String command = "";
        while (!(command = scanner.nextLine()).equals("Print")) {
            String[] tokens = command.split(";");

            Predicate<String> predicate= getPredicate(tokens);
            String predicateName = tokens[1] + tokens[2];
            switch (tokens[0]) {
                case "Add filter":
                    predicates.put(predicateName, predicate);
                    break;
                case "Remove filter":
                    predicates.remove(predicateName);
                    break;
            }
        }

        guests.stream().filter(guest -> {
            for (Predicate<String> predicate : predicates.values()) {
                if (predicate.test(guest)){
                    return false;
                }
            }
            return true;
        } ).forEach(s -> System.out.print(s + " "));



        System.out.println();
    }


    private static Predicate<String> getPredicate(String[] tokens) {
        Predicate<String> predicate = null;

        switch (tokens[1]) {
            case "Starts with":
                predicate = name -> name.startsWith(tokens[2]);
                return predicate;
            case "Ends with":
                predicate = name -> name.endsWith(tokens[2]);
                return predicate;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(tokens[2]);
                return predicate;
            case "Contains":
                predicate = name -> name.contains(tokens[2]);
                return predicate;
        }

        return predicate;
    }

}
