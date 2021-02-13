    import java.util.Scanner;

    public class ResolveEqualSums {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] inputText = scanner.nextLine().split("\\s+");
            int[] numbers = new int[inputText.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(inputText[i]);
            }
            boolean equals = false;
            for (int i = 0; i < numbers.length; i++) {
                int sumLeft = 0;
                int sumRight = 0;
                for (int j = 0; j < i; j++) {
                    sumLeft += numbers[j];
                }
                for (int j = i + 1; j < numbers.length; j++) {
                    sumRight += numbers[j];
                }
                if (sumLeft == sumRight) {
                    equals= true;
                    System.out.println(i);
                }
            }

            if (!equals){
                System.out.println("no");
            }

        }
    }
