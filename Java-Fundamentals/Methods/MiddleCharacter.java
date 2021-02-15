import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        middleChar(inputText);
    }

    public static void middleChar(String text) {
        if (text.length()%2==0){
            int middleChar = text.length()/2;
            System.out.println(text.charAt(middleChar-1)+""+ text.charAt(middleChar) );
        } else {
            int middleChar = text.length()/2;
            System.out.println(text.charAt(middleChar) );
        }
    }
}
