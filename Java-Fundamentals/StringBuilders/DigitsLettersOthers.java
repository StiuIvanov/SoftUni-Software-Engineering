import java.util.List;
import java.util.Scanner;

public class DigitsLettersOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Character[] characters = new Character[input.length()];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = input.charAt(i);
        }
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        for (Character c : characters) {
            if (Character.isDigit(c)){
                digits.append(c);
            } else if (Character.isAlphabetic(c)){
                letters.append(c);
            } else {
                symbols.append(c);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);

    }
}
