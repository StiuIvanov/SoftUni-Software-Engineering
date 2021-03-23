import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> reservations = new TreeSet<>();

        String input;
        while (!(input= scanner.nextLine()).equals("PARTY")){
            reservations.add(input);
        }
        while (!(input= scanner.nextLine()).equals("END")){
            reservations.remove(input);
        }
        System.out.println(reservations.size());
        System.out.println(reservations.stream().collect(Collectors.joining(System.lineSeparator())));

    }
}
