import java.util.Scanner;

public class DailyEarningsBONUSbook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workingDaysInMonth = Integer.parseInt(scanner.nextLine());
        double earnedMoneyDaily = Double.parseDouble(scanner.nextLine());
        double usdRate = Double.parseDouble(scanner.nextLine());

        double salaryMonth = workingDaysInMonth * earnedMoneyDaily;
        double salaryAnnual = salaryMonth * 12 + salaryMonth * 2.5;
        double salaryAfterTaxes = salaryAnnual * 0.75 ;

        double salaryDailyAfterTaxes = salaryAfterTaxes / 365;
        double salaryInBGN = salaryDailyAfterTaxes * usdRate;

        System.out.printf("%.2f", salaryInBGN);
    }
}
