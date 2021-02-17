import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split(" ");
        int[] array = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            array[i] = Integer.parseInt(inputNumbers[i]);
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] operation = command.split(" ");
            switch (operation[0]) {
                case "swap":
                    int index1 = Integer.parseInt(operation[1]);
                    int index2 = Integer.parseInt(operation[2]);
                    int savedNumber1 = array[index1];
                    int savedNumber2 = array[index2];
                    array[index1] = savedNumber2;
                    array[index2] = savedNumber1;
                    break;
                case "multiply":
                     index1 = Integer.parseInt(operation[1]);
                     index2 = Integer.parseInt(operation[2]);
                     savedNumber1 = array[index1];
                     savedNumber2 = array[index2];
                    int result = savedNumber1*savedNumber2;
                    array[index1]= result;
                    break;
                case "decrease":
                    for (int i = 0; i <array.length ; i++) {
                        array[i]=array[i]-1;
                    }
                    break;
            }
            command= scanner.nextLine();
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
            if (i!=array.length-1){
                System.out.print(", ");
            }

        }
    }

}
