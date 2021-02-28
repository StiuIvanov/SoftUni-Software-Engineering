import java.util.Scanner;

public class EasterCozonacs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double floorPrice1Kg = Double.parseDouble(scanner.nextLine());
        double eggsPrice = floorPrice1Kg * 0.75;
        double milkPrice = floorPrice1Kg + floorPrice1Kg * 0.25;

        double pricePerCozonac = floorPrice1Kg + eggsPrice + (0.25*milkPrice);
        double numberCozonacs = budget/pricePerCozonac;
        int countCozonacs = 0;
        int eggsColored = 0;

        while (budget>pricePerCozonac){
            budget-=pricePerCozonac;
            countCozonacs++;
            eggsColored+=3;
            if (countCozonacs%3==0){
                int lostEggs = countCozonacs-2;
                eggsColored-=lostEggs;
            }
        }

        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.", countCozonacs, eggsColored, budget);




    }

}
