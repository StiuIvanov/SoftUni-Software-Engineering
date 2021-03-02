import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int move = 0;
        String[] inputText = scanner.nextLine().split(" ");
        List<String> sequence = new ArrayList<>();
        for (int i = 0; i <inputText.length ; i++) {
            sequence.add(inputText[i]);
        }
        boolean loose = true;

        String[] guessIndex = scanner.nextLine().split(" ");
        while (!guessIndex[0].equals("end")){
            move++;
            int firstGuess = Integer.parseInt(guessIndex[0]);
            int secondGuess = Integer.parseInt(guessIndex[1]);

            if (firstGuess== secondGuess|| firstGuess> sequence.size()-1 || secondGuess> sequence.size()-1|| firstGuess<0|| secondGuess<0){
                System.out.println("Invalid input! Adding additional elements to the board");
                sequence.add(sequence.size()/2, "-"+move+"a");
                sequence.add(sequence.size()/2, "-"+move+"a");
                guessIndex = scanner.nextLine().split(" ");
                continue;
            } else if (sequence.get(firstGuess).equals(sequence.get(secondGuess))){
                System.out.println("Congrats! You have found matching elements - " + sequence.get(firstGuess) + "!");
                sequence.remove(Math.max(firstGuess,secondGuess));
                sequence.remove(Math.min(firstGuess,secondGuess));
            } else {
                System.out.println("Try again!");
            }

            if (sequence.size()==0){
                loose = false;
                System.out.println("You have won in " + move + " turns!");
                break;
            }

            guessIndex= scanner.nextLine().split(" ");
        }

        if (loose){
            System.out.println("Sorry you lose :(");
            for (String s:sequence                 ) {
                System.out.print(s + " ");
            }

        }




    }

}
