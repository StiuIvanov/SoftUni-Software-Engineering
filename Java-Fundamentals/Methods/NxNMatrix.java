import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        nxn(n);
    }

    public static void nxn(int n) {
        for (int i = 1; i <= n; i++) {
            writeLineOfN(n);
            System.out.println();
        }
    }

    public static void writeLineOfN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(n);
            if (i < n) {
                System.out.print(" ");
            }

        }

    }

}
