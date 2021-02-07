import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 1; i <= n ; i++) {
            int curentInput = Integer.parseInt(scanner.nextLine());
            if (curentInput%2==0){
                p1++;
            }
            if (curentInput%3==0) {
                p2++;
            }
            if (curentInput%4==0) {
                p3++;
            }
        }
        double percentP1 = p1*1.0 / n * 100;
        double percentP2 = p2*1.0 / n * 100;
        double percentP3 = p3*1.0 / n * 100;
        System.out.printf("%.2f%%\n", percentP1 );
        System.out.printf("%.2f%%\n", percentP2 );
        System.out.printf("%.2f%%\n", percentP3 );
    }
}
