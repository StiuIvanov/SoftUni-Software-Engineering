        import java.util.Scanner;

        public class FactorialDivision {
            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                double aFactorial = factorialOfN(a);
                double bFactorial = factorialOfN(b);
                double divideFactorials = 1.00*aFactorial/bFactorial;
                System.out.printf("%.2f", divideFactorials);

            }

            public static long factorialOfN(int n){
                long factorialOfN = 1;
                if (n<=1){
                    return 1;
                }
                for (int i = 1; i <= n ; i++) {
                    factorialOfN= i*factorialOfN;
                }
                return factorialOfN;
            }

        }
