import java.util.Scanner;

public class DisneylandJourney {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double journeyPrice = Double.parseDouble(scanner.nextLine());
        int numberOfMonths = Integer.parseInt(scanner.nextLine());
        double savedMoney = 0;

        for (int i = 1; i <=numberOfMonths ; i++) {

            if (i!=1 && i%2==1){
                savedMoney = savedMoney - savedMoney*0.16;
            }

            if (i%4==0){
                double bonusBoss = savedMoney*0.25;
                savedMoney+=bonusBoss;
            }

                savedMoney= savedMoney+journeyPrice*0.25;

        }

        if (savedMoney>=journeyPrice){
            double moneyForSouvenirs = savedMoney-journeyPrice;
            System.out.printf("Bravo! You can go to Disneyland and" +
                    " you will have %.2flv. for souvenirs.",moneyForSouvenirs );
        } else {
            double moneyNeeded = journeyPrice-savedMoney;
            System.out.printf("Sorry. You need %.2flv. more.", moneyNeeded );
        }


    }
}
