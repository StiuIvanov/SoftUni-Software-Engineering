import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = aDouble -> aDouble + aDouble*0.2;

        double[] doubles = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .map(addVat::apply)
                .toArray();

        System.out.println("Prices with VAT:");

        Arrays.stream(doubles).forEach(d-> System.out.printf("%.2f%n",d));
    }
}
