package StackIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomStack customStack = new CustomStack();
        String inValues = scanner.nextLine().replaceAll(",", "");
        String[] initialValues = inValues.split("\\s+");

        for (int i = 1; i < initialValues.length; i++) {
            customStack.push(Integer.parseInt(initialValues[i]));
        }

        String line="";
        while (!(line= scanner.nextLine()).equals("END")){
            if (line.equals("Pop")){
                try{
                    customStack.pop();
                }catch (IllegalStateException e){
                    System.out.println(e.getMessage());
                }
            }else{
                customStack.push(Integer.parseInt(line.split("\\s+")[1]));
            }

        }

        for (int i = 0; i <2; i++) {
            for (Integer element : customStack) {
                System.out.println(element);
            }
            
        }
        
    }
}
