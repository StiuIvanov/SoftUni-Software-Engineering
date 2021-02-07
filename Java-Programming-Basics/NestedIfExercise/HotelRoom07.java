import java.util.Scanner;

public class HotelRoom07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int numberNights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;
        double priceStudio = 0;
        double priceApartment = 0;
//  \n
        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                if (numberNights > 7 && numberNights <= 14) { //  да проверим дали е >= ? 7
                    studio = studio - studio * 0.05;
                } else if (numberNights > 14) {
                    studio = studio - studio * 0.3;
                }
                priceStudio = numberNights * studio;
                priceApartment = numberNights * apartment;
                break;
            case "June":
            case "September":
                studio = 75.2;
                apartment = 68.7;
                if (numberNights > 14) {
                    studio = studio - studio * 0.2;
                }
                priceStudio = numberNights * studio;
                priceApartment = numberNights * apartment;
                break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                priceStudio = numberNights * studio;
                priceApartment = numberNights * apartment;
                break;
        }
        if (numberNights > 14) {
            priceApartment = priceApartment - priceApartment * 0.1;
        }
        System.out.printf("Apartment: %.2f lv.", priceApartment).println();
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
