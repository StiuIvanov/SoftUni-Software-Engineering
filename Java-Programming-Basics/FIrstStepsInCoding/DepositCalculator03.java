import java.util.Scanner;

public class DepositCalculator03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depositedAmount = Double.parseDouble(scan.nextLine());
        int termOfDeposit = Integer.parseInt(scan.nextLine());
        double annualPercent = Double.parseDouble(scan.nextLine());

        double sum = depositedAmount + termOfDeposit * (depositedAmount * (annualPercent * 0.01) / 12);
        System.out.println(sum);
    }
}
