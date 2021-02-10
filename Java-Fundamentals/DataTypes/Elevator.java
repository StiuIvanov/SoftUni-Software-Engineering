import java.util.Scanner;

public class Elevator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
//        int fullCourses = n/p;
//        int halfCourses = 0;
//        if (n%p!=0) {
//            fullCourses++;
//        }
//        System.out.println(fullCourses);
        int courses =(int) Math.ceil(1.0*n/p);
        System.out.println(courses);
    }
}
