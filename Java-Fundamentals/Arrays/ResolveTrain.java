import java.util.Scanner;

public class ResolveTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] wagons = new int[n];
        for (int i = 0; i < n; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
            sum += wagons[i];
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
        System.out.println("\n" + sum);
    }
}
