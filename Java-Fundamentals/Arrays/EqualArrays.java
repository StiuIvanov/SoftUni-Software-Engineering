import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split("\\s+");
        String[] secondArray = scanner.nextLine().split("\\s+");
        int sum = 0;
        boolean match = true;
        int indexDifference = -1;
        for (int i = 0; i <firstArray.length ; i++) {
            if (!firstArray[i].equals(secondArray[i])){
                indexDifference= i;
                match=false;
                break;
            }
            int number = Integer.parseInt(firstArray[i]);
            sum+=number;
        }

        if (match){
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.println("Arrays are not identical. Found difference at " + indexDifference + " index.");
        }

    }
}
