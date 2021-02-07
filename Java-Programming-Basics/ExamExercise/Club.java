import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double commisionWanted = Double.parseDouble(scanner.nextLine());
        double currentCommision = 0;
        double currentOrder = 0;
        int cocktail = 0;
        int numbCoctails = 0;
        String drink = "";
        for (double i = 1; i < commisionWanted; i++) {
            drink = scanner.nextLine();
            switch (drink) {
                case "Party!":
                    i = commisionWanted;
                    break;
            }
            if (!drink.equals("Party!")) {
                cocktail = drink.length();
                numbCoctails = Integer.parseInt(scanner.nextLine());
                currentOrder = numbCoctails * cocktail;
                if (currentOrder% 2 != 0) {
                    currentOrder = currentOrder * 0.75;
                }
                currentCommision = currentCommision + currentOrder;
            }



            if (currentCommision >= commisionWanted) {
                i = commisionWanted;
            }
        }
        if (drink.equals("Party!")) {
            double difference = commisionWanted - currentCommision;
            System.out.printf("We need %.2f leva more.\n", difference);
            System.out.printf("Club income - %.2f leva.", currentCommision);
        } else {
            System.out.printf("Target acquired.\n");
            System.out.printf("Club income - %.2f leva.", currentCommision);
        }
    }
}
