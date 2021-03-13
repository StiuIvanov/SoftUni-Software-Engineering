import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = ">{2}(?<furniture>\\w+)<<(?<price>\\d+(\\.\\d+)?)!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(expression);
        List<String> furnituresList = new ArrayList<>();
        double sum = 0;

        String text = scanner.nextLine();
        while (!text.equals("Purchase")) {
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                String name = matcher.group("furniture");
                double price =Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double currentSum = price*quantity;
                sum+=currentSum;
                furnituresList.add(name);
            }
            text = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furnituresList.forEach(e-> System.out.println(e));
        System.out.printf("Total money spend: %.2f", sum);

    }
}
