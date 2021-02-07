import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int counter = 0;
        int x1 = 0;
        int x2 = 0;
        for (x1 = firstNum; x1 <= secondNum; x1++){
            for (x2 = firstNum; x2 <= secondNum; x2++){
                counter++;
                if (x1+x2==magicNum) {
                    flag = true;
                    break;
                }
            }
            if (flag){
                break; 
            }
        }

        if (flag) {
            System.out.printf("Combination N:%d ", counter);
            System.out.printf("(%d + %d = %d)", x1, x2, magicNum);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}

