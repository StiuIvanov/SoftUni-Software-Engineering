import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(repeatString(scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
    }

    public static String repeatString(String text, int count){
        String[] newRepeatedString = new String[count];
        for (int i = 0; i < count; i++) {
            newRepeatedString[i] = text;
        }
        String joinedString = String.join("", newRepeatedString);
        return joinedString;
    }


}
