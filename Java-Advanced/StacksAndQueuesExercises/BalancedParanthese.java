import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParanthese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        if (input.length()%2==1){
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='{' || input.charAt(i)=='[' ||
                    input.charAt(i)=='('){
                stack.push(input.charAt(i));
            }else{
                switch (stack.peek()){
                    case '{':
                        if (input.charAt(i)=='}'){
                            stack.pop();
                        }
                        break;
                    case '[':
                        if (input.charAt(i)==']'){
                            stack.pop();
                        }
                        break;
                    case '(':
                        if (input.charAt(i)==')'){
                            stack.pop();
                        }
                        break;
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
