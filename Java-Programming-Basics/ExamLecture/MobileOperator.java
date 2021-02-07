import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String period = scanner.nextLine();
        String typeAgreement = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int numMonths = Integer.parseInt(scanner.nextLine());
        double priceMonths = 0;
        double priceINternet = 0;


        switch (period) {
            case "one":
                switch (typeAgreement) {
                    case "Small":
                        priceMonths = 9.98;
                        break;
                    case "Middle":
                        priceMonths =  18.99;
                        break;
                    case "Large":
                        priceMonths =  25.98;
                        break;
                    case "ExtraLarge":
                        priceMonths =  35.99;
                        break;
                }
                break;
            case "two":
                switch (typeAgreement) {
                    case "Small":
                        priceMonths =  8.58;
                        break;
                    case "Middle":
                        priceMonths = 17.09;
                        break;
                    case "Large":
                        priceMonths =  23.59;
                        break;
                    case "ExtraLarge":
                        priceMonths =  31.79;
                        break;
                }
                break;
        }
        if (mobileInternet.equals("yes")){
            if (priceMonths <=10){
                priceINternet = 5.50;
            } else if (priceMonths<=30) {
                priceINternet = 4.35;
            } else {
                priceINternet = 3.85;
            }
        }
        priceMonths= (priceMonths + priceINternet) * numMonths;
        if (period.equals("two")){
            priceMonths = priceMonths - priceMonths * 0.0375;
        }
        System.out.printf("%.2f lv.", priceMonths);



    }
}
