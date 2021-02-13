import java.util.Scanner;

public class Train {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int[] train = new int[n];
        for (int i = 0; i < n; i++) {
            train[i]= scanner.nextInt();
            sum +=train[i];
        }
        for (int i = 0; i < n ; i++) {
            System.out.print(train[i] + " ");
        }
        System.out.println("\n" + sum);
    }
}
