import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int numberInput = Integer.parseInt(scanner.nextLine());
    int sumEven = getSumOfEvenDigits(numberInput);
    int sumOdds = getSumOfOddsDigits(numberInput);
        int multiply = multiplyEvenByOdds(sumEven,sumOdds);
        System.out.println(multiply);
    }

    public static int multiplyEvenByOdds ( int firstNum, int secondNum){
        int first = getSumOfEvenDigits(firstNum);
        int second = getSumOfOddsDigits(secondNum);
        return first*second;
    }

    public static int getSumOfEvenDigits(int number) {
        int sumEvens = 0;
        number= Math.abs(number);
        while (number > 0) {
            int currentDigit = 0;
            currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                sumEvens += currentDigit;
            }
            number = number / 10;
        }
        return sumEvens;
    }

    public static int getSumOfOddsDigits (int number){
        int sumOdds = 0;
        number= Math.abs(number);
        while (number>0){
            int currentDigit = 0;
            currentDigit= number%10;
            if (currentDigit%2==1){
                sumOdds+= currentDigit;
            }
            number/=10;
        }
            return sumOdds;
    }
}
