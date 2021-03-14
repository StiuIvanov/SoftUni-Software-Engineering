import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<name>[A-Z][a-z]+)%([^|$%.]*)<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$";
        Pattern validateRegex = Pattern.compile(regex);
        double totalSum = 0;

        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {
            Matcher inputMatcher = validateRegex.matcher(input);
            if(inputMatcher.find()) {
                String name = inputMatcher.group("name");
                String product = inputMatcher.group("product");
                int count = Integer.parseInt(inputMatcher.group("count"));
                double price = Double.parseDouble(inputMatcher.group("price"));
                double sum = count * price;
                totalSum+=sum;

                System.out.printf("%s: %s - %.2f%n", name, product, sum);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalSum);
    }
}
