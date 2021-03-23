import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> map = new TreeMap<>();

        String line = scanner.nextLine();

        for (int i = 0; i < line.length(); i++) {
            map.putIfAbsent(line.charAt(i), 0);
            map.put(line.charAt(i), map.get(line.charAt(i))+1);
        }

        map.forEach((k,v) -> {
            System.out.printf("%s: %d time/s%n", k,v);
        });

    }
}
