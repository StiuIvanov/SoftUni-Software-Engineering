import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOver20kg = Double.parseDouble(scanner.nextLine());
        double kgBaggage = Double.parseDouble(scanner.nextLine());
        int daysToFly = Integer.parseInt(scanner.nextLine());
        int numBaggages = Integer.parseInt(scanner.nextLine());

        if (kgBaggage< 10){
            priceOver20kg = priceOver20kg * 0.2;
        } else if (kgBaggage >= 10 && kgBaggage<=20){
            priceOver20kg = priceOver20kg * 0.5;
        } else if (kgBaggage > 20) {
            priceOver20kg = priceOver20kg;
        }
        if (daysToFly >30 ){
            priceOver20kg = priceOver20kg + priceOver20kg*0.1;
        } else if (daysToFly>=7 && daysToFly <= 30){
            priceOver20kg = priceOver20kg + priceOver20kg*0.15;
        } else if (daysToFly < 7) {
            priceOver20kg = priceOver20kg + priceOver20kg*0.4;
        }
        System.out.printf("The total price of bags is: %.2f lv.", priceOver20kg * numBaggages);
    }
}
