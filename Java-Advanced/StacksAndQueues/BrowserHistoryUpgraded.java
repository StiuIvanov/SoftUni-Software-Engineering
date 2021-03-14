import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgraded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        String line = scanner.nextLine();

        String current = "";

        while (!line.equals("Home")) {

            if (line.equals("back")) {
                if (history.size()<2) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistory.push(history.pop());
                    System.out.println(history.peek());
                }
                line = scanner.nextLine();
                continue;
            }   else if (line.equals("forward")) {
                if (forwardHistory.isEmpty()){
                    System.out.println("no next URLs");
                    line=scanner.nextLine();
                    continue;
                } else{
                    history.push(forwardHistory.peek());
                    System.out.println(forwardHistory.pop());
                }
            } else {
                forwardHistory.clear();
                history.push(line);
                System.out.println(line);
            }

            line = scanner.nextLine();
        }


    }
}
