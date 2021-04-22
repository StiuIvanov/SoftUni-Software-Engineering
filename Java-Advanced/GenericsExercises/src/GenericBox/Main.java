package GenericBox;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int line = Integer.parseInt(scanner.nextLine());
            Box<Integer> box = new Box<Integer>(line);

            System.out.println(box);
        }

    }

}
