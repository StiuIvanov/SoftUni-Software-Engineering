import java.util.Scanner;

public class OperationsBetweenNumbers06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        double resultEvenOrOdd = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                resultEvenOrOdd = result % 2;
                if (resultEvenOrOdd == 0) {
                    System.out.printf("%d %s %d = %.0f - even", number1, operator, number2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", number1, operator, number2, result);
                }
                break;
            case "-":
                result = number1 - number2;
                resultEvenOrOdd = result % 2;
                if (resultEvenOrOdd == 0) {
                    System.out.printf("%d %s %d = %.0f - even", number1, operator, number2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", number1, operator, number2, result);
                }
                break;
            case "*":
                result = number1 * number2;
                resultEvenOrOdd = result % 2;
                if (resultEvenOrOdd == 0) {
                    System.out.printf("%d %s %d = %.0f - even", number1, operator, number2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", number1, operator, number2, result);
                }
                break;
            case "/":
                if (number1 == 0 || number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    result = number1 * 1.0 / number2;
                    System.out.printf("%d %s %d = %.2f", number1, operator, number2, result);
                }
                break;
            case "%":
                if (number1 == 0 || number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    result = number1 % number2;
                    System.out.printf("%d %s %d = %.0f", number1, operator, number2, result);
                }
                break;
        }
    }
}
