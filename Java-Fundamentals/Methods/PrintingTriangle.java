import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        printTriangle(1, Integer.parseInt(scanner.nextLine()));
    }

    public static void printTriangle(int startNum,int endNum){
        for (int i = startNum; i <= endNum ; i++) {
            printLine(startNum, i);
        }
        for (int i = endNum-1; i >=1 ; i--) {
            printLine(startNum, i);
        }
    }

    public static void printLine (int startNum, int endNum) {
        for (int i = startNum; i <= endNum ; i++) {
            System.out.print(i);
            if (i<endNum){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
