import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        while (firstLine.charAt(0) == '0'){
            firstLine = firstLine.substring(1);
        }

        int secondLIne = Integer.parseInt(scanner.nextLine());

        if (secondLIne == 0) {
            System.out.println(0);
            return;
        }
        int leftover = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = firstLine.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(firstLine.charAt(i)));
            int result = digit * secondLIne + leftover;

            if (result < 10) {
                sb.insert(0, result);
                leftover = 0;
                continue;
            } else {
                if (i==0) {
                    sb.insert(0, result);
                } else {
                int leftForAdd = result % 10;
                    leftover = result / 10;
                    sb.insert(0, leftForAdd);
                }
            }
        }

        System.out.println(sb.toString());

    }
}
