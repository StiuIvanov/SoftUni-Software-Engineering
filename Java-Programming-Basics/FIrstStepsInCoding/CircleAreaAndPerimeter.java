import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        double r = Double.parseDouble(num);

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
