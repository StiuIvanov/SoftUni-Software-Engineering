import java.util.Scanner;

public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int number = Integer.parseInt(scanner.nextLine());
    for (; number >=1; number--) {
        System.out.println(number);
    }
    }
}
