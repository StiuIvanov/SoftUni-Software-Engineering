import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = Integer.parseInt(scanner.nextLine());
        String biggerKeg = "";
        double maxVolume = Double.MIN_VALUE;
        for (int i = 0; i < inputs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI * radius*radius * height;
            if (currentVolume > maxVolume) {
                maxVolume = currentVolume;
                biggerKeg = model;
            }
        }
        System.out.println(biggerKeg);
    }
}
