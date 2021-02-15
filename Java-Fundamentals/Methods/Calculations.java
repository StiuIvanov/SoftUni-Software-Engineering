import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (operation){
            case "add": add(a,b); break;
            case "multiply": multiply(a,b); break;
            case "divide": divide(a,b); break;
            case "subtract": subtract(a,b); break;
        }
    }

    public static void add(int first, int second) {
        System.out.println(first + second);
    }

    public static void multiply(int first, int second) {
        System.out.println(first * second);
    }

    public static void divide(int first, int second) {
        System.out.println(first / second);
    }

    public static void subtract(int first, int second) {
        System.out.println(first - second);
    }
}