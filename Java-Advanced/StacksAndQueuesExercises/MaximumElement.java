import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    int numberX = Integer.parseInt(command[1]);
                    stack.push(numberX);
                    break;
                case "2":
                    if (stack.isEmpty()) {
                        break;
                    }
                    stack.pop(); // Check if isEmpty
                    break;
                case "3":
                    int maxNumber = Integer.MIN_VALUE;
                    ArrayDeque<Integer> stackHistory = new ArrayDeque<>();
                    while (!stack.isEmpty()) {
//                        for (Integer st : stack) {
//                            if (st > maxNumber) {
//                                maxNumber = st;
//                            }
//                        }

                        int currentNum = stack.pop();
                        if (currentNum>maxNumber){
                            maxNumber=currentNum;
                        }
                        stackHistory.push(currentNum);
                    }
                    while (!stackHistory.isEmpty()){
                        stack.push(stackHistory.pop());
                    }
                        System.out.println(maxNumber);
                        break;

                    }
            }

        }
    }
