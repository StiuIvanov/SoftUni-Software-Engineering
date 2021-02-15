import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        signOfIntger(Integer.parseInt(scanner.nextLine()));
    }

    private static void signOfIntger(int number) {
        if (number>0){
            System.out.println("The number "+ number + " is positive.");
        } else if (number<0) {
            System.out.println("The number "+ number + " is negative.");
        } else  {
            System.out.println("The number 0 is zero.");
        }
    }
}
