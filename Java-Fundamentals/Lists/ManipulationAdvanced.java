import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] inputString = scanner.nextLine().split(" ");
        while (!inputString[0].equals("end")) {
            switch (inputString[0]) {
                case "Contains":
                    int numberForCheck = Integer.parseInt(inputString[1]);
                    checkForNumber(numberForCheck, numbers);
                    break;
                case "Print":
                    switch (inputString[1]) {
                        case "even":
                            printEven(numbers);
                            break;
                        case "odd":
                            printOdd(numbers);
                            break;
                    }
                    break;
                case "Get":
                    printSum(numbers);
                    break;
                case "Filter":
                    int finalValue = Integer.parseInt(inputString[2]);
                    printFiltered(numbers, inputString[1], finalValue);
                    break;
            }
            inputString = scanner.nextLine().split(" ");
        }


    }

    public static void printFiltered(List numbers, String operator, int finalValue) {
        switch (operator) {
            case "<":
                for (int i = 0; i < numbers.size(); i++) {
                    if ((int) numbers.get(i) < finalValue) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                return;
            case ">":
                for (int i = 0; i < numbers.size(); i++) {
                    if ((int) numbers.get(i) > finalValue) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                return;
            case ">=":
                for (int i = 0; i < numbers.size(); i++) {
                    if ((int) numbers.get(i) >= finalValue) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                return;
            case "<=":
                for (int i = 0; i < numbers.size(); i++) {
                    if ((int) numbers.get(i) <= finalValue) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                return;
        }
    }


    public static void checkForNumber(int numberForCheck, List numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numberForCheck)) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No such number");
    }

    public static void printEven(List numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = (int) numbers.get(i);
            if (currentNumber % 2 == 0) {
                System.out.print(currentNumber);
                if (i !=numbers.size()-1){
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

    public static void printOdd(List numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = (int) numbers.get(i);
            if (currentNumber % 2 == 1) {
                System.out.print(currentNumber);
                if (i!= numbers.size()-1){
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

    public static void printSum(List numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += (int) numbers.get(i);
        }
        System.out.println(sum);
    }
}


