import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotatoWithQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue,kids);

        int n = Integer.parseInt(scanner.nextLine());

        while (queue.size()>1){
            for (int i = 0; i < n-1; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
