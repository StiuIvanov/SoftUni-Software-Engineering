import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e->Integer.parseInt(e)).toArray();
        int[] secondLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e->Integer.parseInt(e)).toArray();

        int n = firstLine[0];
        int s = firstLine[1];
        int x = firstLine[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queue.offer(secondLine[i]);
        }

        for (int i = 0; i < s; i++) {
            if (queue.isEmpty()){
                break;
            }
            queue.poll();
        }

        if (queue.contains(x)){
            System.out.println("true");
        }else{
            if (queue.isEmpty()){
                System.out.println(0);
            }else{
                int smallestNumber = Integer.MAX_VALUE;
                while (!queue.isEmpty()){
                    int current = queue.poll();
                    if (current<smallestNumber){
                        smallestNumber=current;
                    }
                }
                System.out.println(smallestNumber);
            }
        }

    }
}
