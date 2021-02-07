import java.util.Scanner;

public class SummerOutfit02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String weather = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if (weather.equals("Morning")) {
            if (10 <= temperature && temperature <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (18 < temperature && temperature <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (temperature >= 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
        if (weather.equals("Afternoon")) {
            if (10 <= temperature && temperature <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (18 < temperature && temperature <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (temperature >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }
        if (weather.equals("Evening")) {
            if (10 <= temperature && temperature <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (18 < temperature && temperature <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (temperature >= 25) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);

    }
}
