import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favouriteBook = scanner.nextLine();
        String input = scanner.nextLine();
        int sumBooks = 0;
        boolean isFounded = false;
        while (!input.equals("No More Books")) {
            if (favouriteBook.equals(input)) {
                isFounded = true;
                break;
            }
            sumBooks++;
            input = scanner.nextLine();
        }
        if (isFounded) {
            System.out.printf("You checked %d books and found it.",sumBooks );
        } else {
            System.out.printf("The book you search is not here!\nYou checked %d books.", sumBooks);
        }
    }
}
