import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 1; i <= n; i++) {
            String[] inputStringArray = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                first[i - 1] = Integer.parseInt(inputStringArray[1]);
                second[i - 1] = Integer.parseInt(inputStringArray[0]);
            } else {
                first[i - 1] = Integer.parseInt(inputStringArray[0]);
                second[i - 1] = Integer.parseInt(inputStringArray[1]);
            }
        }
        for (int printFirst : first
        ) {
            System.out.print(printFirst + " ");
        }
        System.out.println();
        for (int secondPrint : second
        ) {
            System.out.print(secondPrint + " ");
        }

//                if (i%2==1){
//                    first[counterFirst] = Integer.parseInt(inputStringArray[0]);
//                    second[counterSecond] = Integer.parseInt(inputStringArray[1]);
//                    counterFirst++;
//                    counterSecond++;
//                } else {
//                    second[counterSecond] = Integer.parseInt(inputStringArray[0]);
//                    first[counterFirst] = Integer.parseInt(inputStringArray[1]);
//                    counterSecond++;
//                    counterFirst++;
//                }
//        }
//        for (int firstArrayPrint:first) {
//            System.out.print(firstArrayPrint + " ");
//        }
//        System.out.println();
//        for (int secondArrayPrint:second) {
//            System.out.print(secondArrayPrint + " ");
    }
}

