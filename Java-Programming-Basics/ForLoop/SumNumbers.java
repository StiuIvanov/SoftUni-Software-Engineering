import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIntegers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1 ; i <= numberOfIntegers; i++ ) {
        sum = sum + Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }

}
