import java.util.Scanner;

public class AreaOfFigure06 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String figure = scaner.nextLine();


        if (figure.equals("square")){
            double side = Double.parseDouble(scaner.nextLine());
            double area = side * side;
            System.out.printf("%.3f", area);
        } else if (figure.equals("rectangle")){
            double side1 = Double.parseDouble(scaner.nextLine());
            double side2 = Double.parseDouble(scaner.nextLine());
            double area = side1 * side2;
            System.out.printf("%.3f", area);
        } else if (figure.equals("circle")){
            double r = Double.parseDouble(scaner.nextLine());
            double area = r * r * Math.PI;
            System.out.printf("%.3f", area);
        } else if (figure.equals("triangle")){
            double side = Double.parseDouble(scaner.nextLine());
            double h = Double.parseDouble(scaner.nextLine());
            double area = side * h / 2;
            System.out.printf("%.3f", area);
        }
    }
}
