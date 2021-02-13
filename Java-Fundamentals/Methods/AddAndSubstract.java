import java.util.Scanner;

public class AddAndSubstract {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
int a = Integer.parseInt(scanner.nextLine());
int b = Integer.parseInt(scanner.nextLine());
int c = Integer.parseInt(scanner.nextLine());
        System.out.println(subtractTwoDigits(sumTwoDigits(a,b),c));
    }

    public static int sumTwoDigits (int first, int second){
        return first+second;
    }

    public static int subtractTwoDigits(int first, int second){
        return first-second;
    }

}
