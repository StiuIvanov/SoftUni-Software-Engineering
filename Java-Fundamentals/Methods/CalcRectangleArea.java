import java.util.Scanner;

public class CalcRectangleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double area = triangleArea(a, b);
        System.out.printf("%.0f", area);
    }

    private static double triangleArea(double sideA, double sideB){
double area = sideA*sideB;
return area;
    }

}
