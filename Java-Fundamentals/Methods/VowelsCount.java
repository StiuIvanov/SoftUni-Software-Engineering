import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(numOfVowels(inputString));
    }

    public static int numOfVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            if (a=='a' || a=='A' || a=='e'||a=='E'||a=='u'||a=='U'||a=='i'||a=='I'||a=='o'||a=='O'){
                count++;
            }

        }

        return count;
    }
}
