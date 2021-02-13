import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputText = scanner.nextLine().split("\\s+");
        int[] array = new int[inputText.length];
        for (int i = 0; i < inputText.length ; i++) {
            array[i]= Integer.parseInt(inputText[i]);
        }
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                sum +=array[i];
            }
        }
        System.out.println(sum);
    }
}

