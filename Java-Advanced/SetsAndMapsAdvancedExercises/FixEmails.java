import java.util.*;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Map<String,String> validEmails = new LinkedHashMap<>();

        while (!name.equals("stop")){
            String input = scanner.nextLine();
            String[] tokens = input.split("\\.");
            if (!tokens[1].equals("com")&&!tokens[1].equals("uk")&&!tokens[1].equals("us")){
                validEmails.put(name,input);
            }

            name= scanner.nextLine();
        }

        validEmails.forEach((k,v) -> {
            System.out.printf("%s -> %s%n",k,v );
        });

    }
}
