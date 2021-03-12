import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] banList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i <banList.length ; i++) {
        int count = banList[i].length();
        String censorship = "";
            for (int j = 0; j <count ; j++) {
                censorship+="*";
            }

            text = text.replace(banList[i], censorship);
        }

        System.out.println(text);
    }
}
