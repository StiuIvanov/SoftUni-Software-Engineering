import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int numTickets = Integer.parseInt(scanner.nextLine());
        int numKidTickets = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double priceService = Double.parseDouble(scanner.nextLine());

        double priceKid = priceAdult * 0.3 + priceService;
        priceAdult += priceService;
        double sumAdults = priceAdult * numTickets;
        double sumKids = priceKid * numKidTickets;
        double sumBoth = sumAdults + sumKids;
        double agencyProfit = sumBoth * 0.2;


        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, agencyProfit);
    }
}
