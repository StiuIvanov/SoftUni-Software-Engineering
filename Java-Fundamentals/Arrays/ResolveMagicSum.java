import java.util.Scanner;

public class ResolveMagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputText = scanner.nextLine().split("\\s+");
        int[] numbers = new int[inputText.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputText[i]);
        }
        int nSum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                int currentSum = numbers[i]+numbers[j];
                if (currentSum==nSum){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
            
        }

    }
}
