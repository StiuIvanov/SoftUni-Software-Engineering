import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numArray = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numArray[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numArray.length; i++) {
            boolean isTopInteger = true;
            for (int j = i + 1; j < numArray.length; j++) {
               if (numArray[i] <= numArray[j]) {
                   isTopInteger = false;
               }
            }
            if (isTopInteger){
                System.out.print(numArray[i] + " ");
            }
        }
    }
}
