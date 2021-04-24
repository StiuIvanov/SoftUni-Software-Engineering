package GenericSwapMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<String>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            box.add(line);
        }

        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();

        box.swapItems(firstIndex,secondIndex);

        System.out.println(box);
    }

}