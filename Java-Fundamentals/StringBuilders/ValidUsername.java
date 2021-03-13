import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidUsername {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");
        for (String token : usernames) {
            if (validateUsername(token)){
                System.out.println(token);
            }
        }

    }

    private static boolean validateUsername(String username){
        if (username.length()<3||username.length()>16){
            return false;
        }

        for (int i = 0; i <username.length() ; i++) {
            char symbol = username.charAt(i);
                if (!(Character.isDigit(symbol) || Character.isAlphabetic(symbol) || symbol=='-'||symbol=='_')){
                    return false;
                }
        }
        return true;
    }
}
