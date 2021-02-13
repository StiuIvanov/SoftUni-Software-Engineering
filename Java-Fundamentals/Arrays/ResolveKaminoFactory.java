import java.util.Scanner;

public class ResolveKaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int maxLength = 0;
        int maxIndex = -1;
        int maxSumOfOnes = 0;
        int dnaSampleNumber = 0;
        int bestDnaSampleNumber = 0;
        int[] bestDNA = new int[n];
        while (!command.equals("Clone them!")) {
            String[] dnaString = command.split("!");
            int[] dna = new int[dnaString.length];
            for (int i = 0; i < dna.length; i++) {
                dna[i] = Integer.parseInt(dnaString[i]);
            } // Прочит
            dnaSampleNumber++;
            int sumOfOnes = 0;
            int currentBestIndex = 0;
            int longestSequencePerSample = 0;
            for (int i = 0; i < dna.length; i++) {
                if (dna[i] == 1) {
                    sumOfOnes++;
                }
            }
            for (int i = 0; i < dna.length; i++) {
                int countLength = 1;
                for (int j = i + 1; j < dna.length; j++) {
                    if (dna[i] == 1 && dna[j] == 1) {
                        countLength++;
                        if (countLength > longestSequencePerSample) {
                            longestSequencePerSample = countLength;
                            currentBestIndex = i;
                        } else {
                            break;
                        }
                    }
                    if (longestSequencePerSample > maxLength) {
                        maxLength = longestSequencePerSample;
                        maxIndex = i;
                        bestDNA = dna;
                        maxSumOfOnes = sumOfOnes;
                        command = scanner.nextLine();
                        continue;
                    }
                    if (longestSequencePerSample == maxLength) {
                        if (maxIndex > currentBestIndex) {
                            command = scanner.nextLine();
                            continue;
                        }

                    }
                }
                command = scanner.nextLine();
            }
            System.out.println("Best DNA sample " + bestDnaSampleNumber + " with sum: " + maxSumOfOnes);
            for (int num : bestDNA) {
                System.out.print(num + " ");
            }


        }
    }
}

