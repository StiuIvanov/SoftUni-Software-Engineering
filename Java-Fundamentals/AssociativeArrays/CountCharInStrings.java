import java.util.*;

public class CountCharInStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> chars = new LinkedHashMap<>();

        String input = scanner.nextLine();
        for (char c : input.toCharArray()) {
            if (c !=' '){
                Integer occurrences = chars.get(c);
                if (occurrences == null){
                    occurrences = 0;
                }
                chars.put(c, occurrences+1 );
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : chars.entrySet()) {
            System.out.println(characterIntegerEntry.getKey() + " -> " + characterIntegerEntry.getValue());
        }

    }
}
