import java.util.Scanner;

public class EXAMcatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Scan
        int minutesDayliPerWalk = Integer.parseInt(scanner.nextLine());
        int numOfWalks = Integer.parseInt(scanner.nextLine());
        int numOfCaloriesTaken = Integer.parseInt(scanner.nextLine());
      //***
        int burnedCalories = minutesDayliPerWalk * numOfWalks * 5;
        double minimumCaloriesDayli = numOfCaloriesTaken * 0.5;

        if (burnedCalories >= minimumCaloriesDayli){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }


    }
}
