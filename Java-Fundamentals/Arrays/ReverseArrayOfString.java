import java.util.Scanner;

public class ReverseArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        for (int i = 0; i < array.length/2 ; i++) {
            String token = array[i];
            array[i]=  array[array.length-1-i];
            array[array.length-1-i]= token;
        }
        System.out.println(String.join(" ", array));


        //       ------- Working ------
//        String[] array = scanner.nextLine().split(" ");
//        String[] arrayReversed = new String[array.length];
//        int count = 0;
//        for (int i = array.length-1; i >= 0; i--) {
//                arrayReversed[count] = array[i];
//                count++;
//            }
//
//        System.out.println(String.join(" ", arrayReversed));
    }
}

