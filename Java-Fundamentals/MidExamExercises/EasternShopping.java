import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasternShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputText = scanner.nextLine().split(" ");
        List<String> shops = new ArrayList<>();
        for (int i = 0; i < inputText.length; i++) {
            shops.add(inputText[i]);
        }

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            switch (tokens[0]) {
                case "Include":
                    shops.add(tokens[1]);
                    break;
                case "Visit":
                    int numberOfShops = Integer.parseInt(tokens[2]);
                    if (shops.size() < numberOfShops) {
                        break;
                    }
                    switch (tokens[1]) {
                        case "first":
                            for (int j = 0; j < numberOfShops; j++) {
                                shops.remove(0);
                            }
                            break;
                        case "last":
                            for (int j = 0; j < numberOfShops; j++) {
                                shops.remove(shops.size() - 1);
                            }
                            break;
                    }
                    break;
                case "Prefer":
                    int shopIndex1 = Integer.parseInt(tokens[1]);
                    int shopIndex2 = Integer.parseInt(tokens[2]);
                    if (shopIndex1 >= 0 && shopIndex1 < shops.size() && shopIndex2 >= 0 && shopIndex2 < shops.size()) {
                        String oldElement = shops.get(shopIndex1);
                        shops.set(shopIndex1, shops.get(shopIndex2));
                        shops.set(shopIndex2, oldElement);
                    }
                    break;
                case "Place":
                    int shopIndex = Integer.parseInt(tokens[2]);
                    if (shopIndex + 1 >= 0 && shopIndex + 1 < shops.size()) {
                        shops.add(shopIndex + 1, tokens[1]);
                    }
                    break;
            }
        }

        System.out.println("Shops left:");
        for (String s : shops) {
            System.out.print(s + " ");

        }


    }
}
