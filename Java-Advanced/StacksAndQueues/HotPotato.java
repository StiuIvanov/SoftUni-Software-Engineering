import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> kids = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int currentLastKid = 0;

        int n = Integer.parseInt(scanner.nextLine());

        while (kids.size() != 1) {
            currentLastKid=currentLastKid+n-1;
            while (currentLastKid>kids.size()-1){
                currentLastKid-=kids.size();
            }
            System.out.println("Removed " + kids.remove(currentLastKid));
        }
        System.out.println("Last is " + kids.remove(0));


    }
}