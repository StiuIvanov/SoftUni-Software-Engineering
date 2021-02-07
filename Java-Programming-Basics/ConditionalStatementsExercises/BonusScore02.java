    import java.util.Scanner;

    public class BonusScore02 {
        public static void main(String[] args) {
            Scanner scanner =  new Scanner(System.in);
            int numberInput = Integer.parseInt(scanner.nextLine());

            double bonusPoints = 0;
            if (numberInput <= 100){
                bonusPoints = 5;
            } else if (numberInput < 1000){
                bonusPoints = numberInput * 0.2;
            } else if (numberInput > 1000){
                bonusPoints = numberInput * 0.1;
            }

            if (numberInput % 2 == 0){
                bonusPoints = bonusPoints + 1;
            } else if (numberInput % 10 == 5){
                bonusPoints = bonusPoints + 2;
            }
            double totalScore = numberInput + bonusPoints;
            System.out.println(bonusPoints);
            System.out.println(totalScore);
        }
    }
