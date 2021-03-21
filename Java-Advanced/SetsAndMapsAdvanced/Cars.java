import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> registration = new LinkedHashSet<>();

        String[] tokens = scanner.nextLine().split(", ");

        while (!tokens[0].equals("END")) {
            switch (tokens[0]) {
                case "IN":
                    registration.add(tokens[1]);
                    break;
                case "OUT":
                    registration.remove(tokens[1]);
                    break;
            }
            tokens = scanner.nextLine().split(", ");
        }

        if (registration.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            System.out.println(registration.stream().collect(Collectors.joining(System.lineSeparator())));
        }
    }
}
