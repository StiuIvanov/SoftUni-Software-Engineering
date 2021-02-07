import java.util.Scanner;

public class MetricConverter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberInput = Double.parseDouble(scanner.nextLine());
        String metricType = scanner.nextLine();
        String metricConversionType = scanner.nextLine();
        double mm = 0;
        if (metricType.equals("mm")){
            mm = numberInput;
        } else if (metricType.equals("cm")){
            mm = numberInput * 10;
        } else {
            mm = numberInput * 1000;
        }
        if (metricConversionType.equals("mm")){
            mm = mm;
        } else if (metricConversionType.equals("cm")){
            mm = mm / 10;
        } else {
            mm = mm / 1000;
        }
        System.out.printf("%.3f", mm);
    }
}
