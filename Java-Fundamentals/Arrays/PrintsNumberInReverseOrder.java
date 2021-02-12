import java.util.Scanner;

public class PrintsNumberInReverseOrder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numberArray = new int[n];
        for (int i = 0; i < n ; i++) {
            numberArray[i]= Integer.parseInt(scanner.nextLine());
        }

        for (int i = numberArray.length-1; i >=0 ; i--) {
            System.out.print(numberArray[i] + " ");
        }
    }
}
