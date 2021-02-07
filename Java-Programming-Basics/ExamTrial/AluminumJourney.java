import java.util.Scanner;

public class AluminumJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numWindows = Integer.parseInt(scanner.nextLine());
        String typeWindow = scanner.nextLine();
        String delivery = scanner.nextLine();
        double pricePerItem = 0;
        switch (typeWindow) {
            case "90X130":
                pricePerItem = 110;
                if (numWindows > 30 && numWindows <= 60) {
                    pricePerItem = pricePerItem - pricePerItem*0.05;
                } else if (numWindows>60){
                    pricePerItem = pricePerItem - pricePerItem*0.08;
                }
                break;
            case "100X150":
                pricePerItem = 140;
                if (numWindows > 40 && numWindows <= 80) {
                    pricePerItem = pricePerItem - pricePerItem*0.06;
                } else if (numWindows>80){
                    pricePerItem = pricePerItem - pricePerItem*0.1;
                }
                break;
            case "130X180":
                pricePerItem = 190;
                if (numWindows > 20 && numWindows <= 50) {
                    pricePerItem = pricePerItem - pricePerItem*0.07;
                } else if (numWindows>50){
                    pricePerItem = pricePerItem - pricePerItem*0.12;
                }
                break;
            case "200X300":
                pricePerItem = 250;
                if (numWindows > 25 && numWindows <= 50) {
                    pricePerItem = pricePerItem - pricePerItem*0.09;
                } else if (numWindows>50){
                    pricePerItem = pricePerItem - pricePerItem*0.14;
                }
                break;
        }

        double sum = pricePerItem * numWindows;
        if (delivery.equals("With delivery")){
            sum += 60;
        }
        if (numWindows>99){
            sum = sum - sum*0.04;
        }
        if (numWindows<10) {
            System.out.printf("Invalid order");
        } else {
            System.out.printf("%.2f BGN", sum );

        }
    }
}
