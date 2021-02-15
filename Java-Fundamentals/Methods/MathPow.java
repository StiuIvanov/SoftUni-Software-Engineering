import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPow {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double pow = mathPower(a, b);
        System.out.println(new DecimalFormat("0.####").format(pow));

    }
    public static double mathPower(double a, int bPower){
        double pow = Math.pow(a, bPower);
        return pow;
    }
}
