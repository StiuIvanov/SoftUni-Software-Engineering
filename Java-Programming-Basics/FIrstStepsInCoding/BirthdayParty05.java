import java.util.Scanner;

public class BirthdayParty05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());

        double cake = rent * 0.2;
        double drinks = cake * 0.55;
        double animator = (1.0 / 3) * rent;

        System.out.printf("%f", rent + cake + drinks + animator);
    }
}
