import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String[] firstArray = firstLine.split(" ");
        String[] secondArray = secondLine.split(" ");

        for (String first : firstArray) {
            for (String second :
                    secondArray) {
                if (first.equals(second)){
                    System.out.print(first + " ");
                }
            }
        }
    }
}
