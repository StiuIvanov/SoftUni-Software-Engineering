import java.util.*;
import java.util.stream.Collectors;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stackNums = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            stackNums.push(nums[i]);
        }

        while (!stackNums.isEmpty()){
            System.out.print(stackNums.poll() + " ");
        }

    }
}
