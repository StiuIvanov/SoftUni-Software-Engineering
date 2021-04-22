package GenericSwapMethodIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Integer> box = new Box<>();

        for (int i = 0; i < n; i++) {
            int line =Integer.parseInt(scanner.nextLine());
            box.add(line);
        }

        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();

        box.swapItems(firstIndex,secondIndex);

        System.out.println(box);
    }

}
