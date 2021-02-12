import java.util.Scanner;

public class MagiSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split(" ");
        int magicNum = Integer.parseInt(scanner.nextLine());
        int[] inputInt = new int[inputString.length];
        for (int i = 0; i < inputString.length; i++) {
            inputInt[i]=Integer.parseInt(inputString[i]);
        }

        for (int i = 0; i < inputInt.length ; i++) {
            for (int j = i+1; j <inputInt.length ; j++) {
                if (inputInt[i]+inputInt[j]==magicNum){
                    System.out.println(inputInt[i] + " " + inputInt[j]);
                }
            }
        }
    }
}
