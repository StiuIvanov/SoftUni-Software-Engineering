import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] word = scanner.nextLine().split(" ");
        System.out.println(sumOfStringsCharacters(word[0], word[1]));
    }

    private static int sumOfStringsCharacters(String s, String s1) {
            int sum = 0;
        for (int i = 0; i <Math.min(s.length(), s1.length()) ; i++) {
            sum+= s.charAt(i) * s1.charAt(i);
        }
        if (s.length()!=s1.length()){
            String longerWord = "";
            if (s.length()>s1.length()){
                longerWord=s;
            }else{
                longerWord=s1;
            }
            String substring = longerWord.substring(Math.min(s.length(),s1.length()));
            for (int i = 0; i <substring.length() ; i++) {
                sum+=substring.charAt(i);
            }
        }

        return sum;
    }

}
