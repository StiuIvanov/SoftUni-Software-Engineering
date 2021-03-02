import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        boolean isFull = false;
        List<Integer> wagons = new ArrayList<>();
        String[] inputText = scanner.nextLine().split(" ");
        for (int i = 0; i < inputText.length; i++) {
            int wagon = Integer.parseInt(inputText[i]);
            wagons.add(wagon);
        }

        for (int i = 0; i < wagons.size(); i++) {
            int freeSeatsInWagon = 4 - wagons.get(i);
            if (peopleWaiting >= freeSeatsInWagon) {
                peopleWaiting -= freeSeatsInWagon;
                wagons.set(i, 4);
            } else {
                wagons.set(i, peopleWaiting);
                peopleWaiting=0;
                freeSeatsInWagon-=peopleWaiting;
                break;
            }
        }

        if (peopleWaiting==0 ) {
            if (wagons.get(wagons.size() - 1) == 4) {
                for (int w : wagons) {
                    System.out.print(w + " ");
                }
            } else {
                System.out.printf("The lift has empty spots!%n");
                for (int w : wagons) {
                    System.out.print(w + " ");
                }
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
            for (int w : wagons) {
                System.out.print(w + " ");
            }
        }
    }
}
