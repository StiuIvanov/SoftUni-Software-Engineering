import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String line = "";
        while (!(line = scanner.nextLine()).equals("Party!")) {
            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Double":
                    addOneMore(getPredicate(tokens),guests);
                    break;
                case "Remove":
                    remove(getPredicate(tokens), guests);
                    break;
            }
        }

        if (guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else{
            Collections.sort(guests);
            System.out.println(String.join(", ", guests) + " are going to the party!");
        }

    }

    private static void remove(Predicate<String> predicate, List<String> guests) {
        List<String> guestsToRemove = new ArrayList<>();

        guests.stream().filter(predicate).forEach(guestsToRemove::add);
        guests.removeAll(guestsToRemove);
    }

    private static void addOneMore(Predicate<String> predicate, List<String> guests) {
        List<String> toAddGuests = new ArrayList<>();

        guests.stream().filter(predicate).forEach(toAddGuests::add);
        guests.addAll(toAddGuests);
    }

    public static Predicate<String> getPredicate(String[] tokens){
        Predicate<String> predicate = null;

        switch (tokens[1]) {
            case "StartsWith":
                predicate = name -> name.startsWith(tokens[2]);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(tokens[2]);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(tokens[2]);
                break;
        }

        return predicate;
    }
}
