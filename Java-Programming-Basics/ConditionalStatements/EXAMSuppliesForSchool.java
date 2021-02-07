import java.util.Scanner;

public class EXAMSuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double packagePensPrice = 5.80;
        double packageHighlighterPrice = 7.20;
        double cleanerPerLiterPrice = 1.20;

        int numOfPens = Integer.parseInt(scanner.nextLine());
        int numOfHighlighters = Integer.parseInt(scanner.nextLine());
        double litersCleaner = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double sumPens = numOfPens * packagePensPrice;
        double sumHighlighters = numOfHighlighters * packageHighlighterPrice;
        double sumCleaner = litersCleaner * cleanerPerLiterPrice;
        double sumTotal = sumPens + sumHighlighters + sumCleaner;
        double sumDiscount = sumTotal * (percentDiscount * 0.01);
        double sumFinal = sumTotal - sumDiscount;
        System.out.printf("%.3f", sumFinal);
    }
}
