import java.util.Scanner;

public class Journey05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double usedBudget = 0;
        String destination = "";
        String typeOfVacation = "";


        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                typeOfVacation = "Camp";
                usedBudget = budget * 0.30;
            } else if (season.equals("winter")) {
                typeOfVacation = "Hotel";
                usedBudget = budget * 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                typeOfVacation = "Camp";
                usedBudget = budget * 0.40;
            } else if (season.equals("winter")) {
                typeOfVacation = "Hotel";
                usedBudget = budget * 0.80;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            typeOfVacation = "Hotel";
            usedBudget = budget * 0.90;
        }

        System.out.printf("Somewhere in %s", destination).println();
        System.out.printf("%s - %.2f", typeOfVacation, usedBudget);
    }
}
