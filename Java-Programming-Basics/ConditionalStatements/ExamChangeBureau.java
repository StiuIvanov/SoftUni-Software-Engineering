import java.util.Scanner;

public class ExamChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoinCurrencyInBGN = 1168;
        double chineseYuanCurrnecyInUSD = 0.15;
        double usdCurrencyInBGN = 1.76;
        double euroCurrencyInBGN = 1.95;
        //Inputs
        int numOfBitcoins = Integer.parseInt(scanner.nextLine());
        double numOfYuan = Double.parseDouble(scanner.nextLine());
        double commisionBank = Double.parseDouble(scanner.nextLine());
        //***
        int sumOfBitcoinsBGN = numOfBitcoins * bitcoinCurrencyInBGN;
        double sumOfYuanUSD = numOfYuan * chineseYuanCurrnecyInUSD;
        double sumOfYuanBGN = sumOfYuanUSD * usdCurrencyInBGN;
        double sumTotalBGN = sumOfYuanBGN + sumOfBitcoinsBGN;
        double sumTotalEUR = sumTotalBGN / euroCurrencyInBGN;
        double sumAfterCommisionEUR = sumTotalEUR - sumTotalEUR * (commisionBank *0.01);
        System.out.printf("%.2f", sumAfterCommisionEUR);


    }
}
