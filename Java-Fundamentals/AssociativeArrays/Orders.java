import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> ordersMAP = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] inputTokens = input.split("\\s+");
            String name = inputTokens[0];
            Double price = Double.parseDouble(inputTokens[1]);
            Double quantity = Double.parseDouble(inputTokens[2]);

            if (!ordersMAP.containsKey(name)) {
                ordersMAP.put(name, new ArrayList<>());
                ordersMAP.get(name).add(price);
                ordersMAP.get(name).add(quantity);
            } else {
                double newQuantity = ordersMAP.get(name).get(1) + quantity;
                ordersMAP.get(name).set(1, newQuantity);
                ordersMAP.get(name).set(0, price);
            }

            input = scanner.nextLine();
        }


        for (Map.Entry<String, List<Double>> entry : ordersMAP.entrySet()) {
            double totalPrice = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }

    }
}
