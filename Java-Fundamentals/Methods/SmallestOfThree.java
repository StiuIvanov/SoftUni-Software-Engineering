import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());
        System.out.println(smallestNum(a,b,c));
    }
    public static int smallestNum (int first, int second, int third){
        int min = Math.min(first, second);
        min = Math.min(min, third);
        return min;
    }
}
