import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (int i = 0; i <words.length ; i++) {
            String wordInLowerCase = words[i].toLowerCase();
            Integer count = occurrences.get(wordInLowerCase);
            if (count==null){
                 count=0;
            }

            occurrences.put(wordInLowerCase, count+1);
        }

        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : occurrences.entrySet()) {
                if (stringIntegerEntry.getValue()%2==1){
                odds.add(stringIntegerEntry.getKey());
            }
        }
        System.out.println(String.join(", ", odds));
    }
}
