import java.util.Scanner;

public class Substring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String secondLine = scanner.nextLine();

        while (secondLine.indexOf(key)!=-1){
           secondLine =  secondLine.replace(key, "");
        }
        System.out.println(secondLine);



    }
}
