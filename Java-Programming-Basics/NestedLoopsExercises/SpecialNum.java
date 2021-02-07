import java.util.Scanner;

public class SpecialNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int firstN = 1; firstN <= 9; firstN++) {
            for (int secdonN = 1; secdonN <= 9; secdonN++) {
                for (int thirdN = 1; thirdN <= 9; thirdN++) {
                    for (int fourthN = 1; fourthN <= 9; fourthN++) {
                        boolean check1 = n % firstN == 0;
                        boolean check2 = n % secdonN == 0;
                        boolean check3 = n % thirdN == 0;
                        boolean check4 = n % fourthN == 0;
                        if (check1 && check2 && check3 && check4) {
                            System.out.printf("%d%d%d%d ", firstN, secdonN, thirdN, fourthN);
                        }

                    }
                }
            }
        }


//        for (int i = 1111; i <= 9999; i++) {
//            int firstDigit = i / 1000;
//            int secondDigit = i / 100 % 10;
//            int thirdDigit = i / 10 % 10;
//            int fourthDigit = i % 10;
//            boolean check1 =  firstDigit != 0 && n % firstDigit == 0;
//            boolean check2 = secondDigit != 0 && n % secondDigit == 0;
//            boolean check3 = thirdDigit != 0 && n % thirdDigit == 0;
//            boolean check4 = fourthDigit != 0 && n % fourthDigit == 0;
//            if (check1 && check2 && check3 && check4) {
//                System.out.print(i + " ");
//            }
    }
}
