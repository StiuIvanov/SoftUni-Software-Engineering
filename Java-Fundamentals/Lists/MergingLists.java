import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = parseLineOfNumbers(scanner);
        List<Integer> secondList = parseLineOfNumbers(scanner);
        List<Integer> mergedList = new ArrayList<>();
        int indexFirst = 0;
        int indexSecond = 0;
        while (indexFirst<firstList.size() || indexSecond<secondList.size()){
            if (indexFirst<firstList.size()){
                mergedList.add(firstList.get(indexFirst));
            }
            if (indexSecond<secondList.size()){
                mergedList.add(secondList.get(indexSecond));
            }
            indexFirst++;
            indexSecond++;
        }

        for (int number:mergedList) {
            System.out.print(number + " ");
        }

    }

    public static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] numbersAsString = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : numbersAsString) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }


}
