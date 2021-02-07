import java.util.Scanner;

public class TrapezoidAreaPBExercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("b1 = ");
        double b1 = Double.parseDouble(scanner.nextLine());
        System.out.print("b2 = ");
        double b2 = Double.parseDouble(scanner.nextLine());
        System.out.print("h1 =");
        double h1 = Double.parseDouble(scanner.nextLine());

        double areaTrapezoid = (b1 + b2) * h1 / 2;
        System.out.println(areaTrapezoid);
    }
}
