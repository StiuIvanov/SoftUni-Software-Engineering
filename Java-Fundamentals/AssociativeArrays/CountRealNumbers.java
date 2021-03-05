import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numberOccurences = new TreeMap<>();

        String[] numbersAsStrings = scanner.nextLine().split(" ");
        for (int i = 0; i < numbersAsStrings.length; i++) {
            double numbers = Double.parseDouble(numbersAsStrings[i]);

            Integer occurences = numberOccurences.get(numbers);
            if (occurences == null){
                occurences=0;
            }
            numberOccurences.put(numbers,occurences+1);
        }

        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(df.format(entry.getKey()) + " -> "+ entry.getValue());
        }

    }
}
