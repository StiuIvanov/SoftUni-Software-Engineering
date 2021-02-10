import java.util.Scanner;

public class Tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int sum = 0;
        int inputs = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < inputs; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (litters+sum<=capacity) {
                sum += litters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);
    }
}
