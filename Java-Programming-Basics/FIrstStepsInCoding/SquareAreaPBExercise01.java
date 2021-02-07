import java.util.Scanner;

public class SquareAreaPBExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();
        int area = a * a;

        System.out.print("Square area = ");
        System.out.println(area);
    }
}
