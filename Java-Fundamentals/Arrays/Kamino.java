import java.util.Scanner;

public class Kamino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int[] currentSequence = new int[length];
        int bestLine = 0;
        int bestSumSequence = -1;
        int bestIndex = Integer.MAX_VALUE;
        int bestLongestSequence = 0;
        int bestSumOnes = 0;
        int[] bestLineArray = new int[currentSequence.length];

        int currentLine = 0;
        while (!command.equals("Clone them!")) {
            String[] sequence = command.split("!+");
            currentLine++;
            int currentBestIndexLeft = -1;
            int longestSequence = 0;
            int sumOnes= 0;

            for (int i = 0; i < sequence.length; i++) {
                currentSequence[i] = Integer.parseInt(sequence[i]);
            }
            for (int i = 0; i < currentSequence.length; i++) {
                if (currentSequence[i]==1){
                    sumOnes++;
                }
            }
            for (int i = 0; i < currentSequence.length; i++) {
                int counterOnesCurrent = 1;
                for (int j = i + 1; j < currentSequence.length; j++) {
                    if (currentSequence[i] == currentSequence[j] && currentSequence[i] == 1) {
                        counterOnesCurrent++;
                        if (counterOnesCurrent > longestSequence ) {
                            longestSequence = counterOnesCurrent;
                            currentBestIndexLeft = i;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (bestLongestSequence<longestSequence){
                bestLongestSequence= longestSequence;
                bestIndex= currentBestIndexLeft;
            } else if ( bestLongestSequence> longestSequence){
                command = scanner.nextLine();
                continue;
            }
            if (bestIndex < currentBestIndexLeft){
                command = scanner.nextLine();
                continue;
            } else if (currentBestIndexLeft< bestIndex){
                bestIndex= currentBestIndexLeft;
                for (int i = 0; i < currentSequence.length ; i++) {
                    bestLineArray[i]= currentSequence[i];
                }
                if (sumOnes> bestSumOnes){
                    bestSumOnes= sumOnes;
                }
                if ( bestSumOnes > sumOnes ){
                    command = scanner.nextLine();
                    continue;
                }
                bestLine= currentLine;
                command = scanner.nextLine();
                continue;
            }


            if (bestSumOnes>sumOnes){
                command=scanner.nextLine();
                continue;
            }

            for (int i = 0; i < currentSequence.length ; i++) {
                bestLineArray[i]= currentSequence[i];
            }

            bestSumOnes=sumOnes;

bestLine= currentLine;



            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",bestLine, bestSumOnes);
        for (int i = 0; i < bestLineArray.length ; i++) {
            System.out.print(bestLineArray[i] + " ");
        }
    }
}