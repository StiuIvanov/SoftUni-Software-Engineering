import java.util.Scanner;

   public class LearningRoom {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double l = Double.parseDouble(scanner.nextLine()) * 100;
    double w = Double.parseDouble(scanner.nextLine()) * 100;

    double numOfDesksLenght = l / 120;
    double numOfDesksWidth = (w - 100) / 70;
    double numOfSeats = numOfDesksLenght * numOfDesksWidth - 3;

        System.out.println(numOfSeats);
// Не е завършена
    }
}
