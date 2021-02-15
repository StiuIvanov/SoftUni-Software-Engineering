import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "char":
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                System.out.println(getMax(first,second));
                break;
            case "int":
                int firstInt = Integer.parseInt(scanner.nextLine());
                int secondInt = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstInt, secondInt));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString) );
                break;
        }

    }

    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    public static char getMax(char firstChar, char secondChar) {
        int a= firstChar;
        int b= secondChar;
        if (firstChar > secondChar) {
            return firstChar;
        }
        return secondChar;
    }

    public static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString)>=0) {
            return firstString;
        }
        return secondString;
    }
}
