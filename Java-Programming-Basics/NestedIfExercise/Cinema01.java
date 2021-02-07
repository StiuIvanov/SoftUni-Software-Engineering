import java.util.Scanner;

public class Cinema01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seats = rows * columns;
        double budget = 0;

        if (projection.equals("Premiere")) {
            budget = seats * 12.00;
        } else if (projection.equals("Normal")) {
            budget = seats * 7.50;
        } else if (projection.equals("Discount")) {
            budget = seats * 5;
        }
        System.out.printf("%.2f leva", budget);
    }
}
