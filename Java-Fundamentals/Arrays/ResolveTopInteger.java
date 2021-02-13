import java.util.Scanner;

public class ResolveTopInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] inputText = scanner.nextLine().split("\\s+");
        int[] numbers = new int[inputText.length];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]= Integer.parseInt(inputText[i]);
        }

        for (int i = 0; i < numbers.length ; i++) {
            boolean isBigger = true;
            for (int j = i+1; j < numbers.length ; j++) {
                if (numbers[i]<= numbers[j]){
                    isBigger= false;
                }
            }
            if (isBigger){
                System.out.print(numbers[i] + " ");
            }

        }



    }
}
