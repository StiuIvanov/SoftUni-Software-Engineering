import java.util.Scanner;

public class ToyShop04Revision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1.2.3.4.5Цени на играчки
//                вход в конзола 1.2.3.4.5.6.
        // ако общяи брой>=50 има 25% отстъпка
        // от крайната печалба вадим 10%
        //остатък/недостиг = спечелениПари - ценаВаканция
        //принт ако има да, ако няма не.

        //*Prices
        double pricePerPuzzle = 2.60;
        int pricePerTalkingDoll = 3;
        double pricePerTeddyBear = 4.10;
        double pricePerMinion = 8.20;
        int pricePerTruck = 2;
        //***
        //*Scanner Console Ins
        double costOfVacation = Double.parseDouble(scanner.nextLine());
        int numOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numOfTalkingDolls = Integer.parseInt(scanner.nextLine());
        int numOfTeddyBears = Integer.parseInt(scanner.nextLine());
        int numOfMinions = Integer.parseInt(scanner.nextLine());
        int numOfTrucks = Integer.parseInt(scanner.nextLine());
        //***
        int numTotal = numOfPuzzles + numOfTalkingDolls + numOfTeddyBears + numOfMinions + numOfTrucks;
        double priceTotal = (pricePerPuzzle * numOfPuzzles) + (pricePerTalkingDoll * numOfTalkingDolls) + (pricePerTeddyBear * numOfTeddyBears) + (pricePerMinion * numOfMinions) + (pricePerTruck * numOfTrucks);
        if (numTotal >= 50){
            priceTotal = priceTotal - 0.25 * priceTotal;
        }
        double priceTotal25 = priceTotal;
        double priceTotal10Final = priceTotal25 - 0.10 * priceTotal25;
        double priceDifference = Math.abs(priceTotal10Final - costOfVacation);
        //Sout
        if (priceTotal10Final >= costOfVacation){
            System.out.printf("Yes! %.2f lv left.", priceDifference );
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceDifference);
        }

    }
}
