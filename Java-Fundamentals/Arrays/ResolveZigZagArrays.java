import java.util.Scanner;

public class ResolveZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] even = new int[n];
        int[] odds = new int[n];
        for (int i = 0; i < n; i++) {
            String[] inputText = scanner.nextLine().split("\\s+");
            if (i%2==1){
                odds[i] = Integer.parseInt(inputText[0]);
                even[i] = Integer.parseInt(inputText[1]);
            } else {
                odds[i] = Integer.parseInt(inputText[1]);
                even[i] = Integer.parseInt(inputText[0]);
            }
        }

        for (int sec : even) {
            System.out.print( sec + " ");
        }

        System.out.println();

        for (int first : odds) {
            System.out.print(first+ " ");
        }


    }
}
