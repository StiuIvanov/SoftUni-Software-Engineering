import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String[] input = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        String[] test = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length() ; j++) {
                result.append(test[i]);
            }
        }

        System.out.println(result.toString());
    }

    public static String repeat(String word, int n) {
        String[] repeated = new String[n];
        for (int i = 0; i < n; i++) {
            repeated[i] = word;
        }
        return String.join("", repeated);
    }


}
