import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");

        ArrayDeque<String> calcStack = new ArrayDeque<>();

        for (int i = line.length-1; i >= 0; i--) {
            calcStack.push(line[i]);
        }

        while (calcStack.size()>1){
            int first = Integer.parseInt(calcStack.pop());
            String op =  calcStack.pop();
            int second = Integer.parseInt(calcStack.pop());

            switch (op){
                case "+":
                    calcStack.push(String.valueOf(first+second));
                    break;
                case "-":
                    calcStack.push(String.valueOf(first-second));
                    break;
            }
        }

        System.out.println(calcStack.pop());
    }
}
