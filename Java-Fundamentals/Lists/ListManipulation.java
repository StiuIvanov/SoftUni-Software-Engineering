import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")){
            int value = Integer.parseInt(command[1]);
            switch (command[0]){
                case "Add": numbers.add(value); break;
                case "Remove": numbers.remove((Integer) value); break;
                case "RemoveAt":numbers.remove(value); break;
                case "Insert": numbers.add(Integer.parseInt(command[2]),
                        Integer.parseInt(command[1])); break;
            }

            command = scanner.nextLine().split(" ");
        }

        for (int number: numbers                 ) {
            System.out.print(number + " ");
        }


    }
}
