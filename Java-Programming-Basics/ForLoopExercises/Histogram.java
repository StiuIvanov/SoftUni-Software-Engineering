import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = Integer.parseInt(scanner.nextLine());
        int currentNumber = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= inputs; i++) {
            currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < 200) {
            p1 += 1;
            } else if (currentNumber >= 200 && currentNumber <= 399) {
                p2 += 1;
            } else if (currentNumber >= 400 && currentNumber <= 599) {
                p3 += 1;
            } else if (currentNumber >= 600 && currentNumber <= 799) {
                p4 += 1;
            } else {
                p5 +=1;
            }
        }
        double p1Percent = p1 / inputs * 100;
        double p2Percent = p2 / inputs * 100;
        double p3Percent = p3 / inputs * 100;
        double p4Percent = p4 / inputs * 100;
        double p5Percent = p5 / inputs * 100;
        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%%n", p5Percent);
    }
}
