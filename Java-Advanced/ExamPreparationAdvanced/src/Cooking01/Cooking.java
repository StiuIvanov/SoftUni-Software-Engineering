package Cooking01;

import java.util.*;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquidsDeque = new ArrayDeque<>();
        ArrayDeque<Integer> ingredientsStack = new ArrayDeque<>();

        int[] line = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : line) {
            liquidsDeque.offer(i);
        }

        int[] secondLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : secondLine) {
            ingredientsStack.push(i);
        }

        Map<String, Integer> foods = new LinkedHashMap<>();
        foods.put("Bread", 0);
        foods.put("Cake", 0);
        foods.put("Fruit Pie", 0);
        foods.put("Pastry", 0);

        while (!liquidsDeque.isEmpty() && !ingredientsStack.isEmpty()) {
            int currentIngredient = ingredientsStack.pop();
            int currentLiquid = liquidsDeque.poll();
            int sum = currentIngredient + currentLiquid;

            switch (sum) {
                case 25:
                    foods.put("Bread", foods.get("Bread") + 1);
                    break;
                case 50:
                    foods.put("Cake", foods.get("Cake") + 1);
                    break;
                case 75:
                    foods.put("Pastry", foods.get("Pastry") + 1);
                    break;
                case 100:
                    foods.put("Fruit Pie", foods.get("Fruit Pie") + 1);
                    break;
                default:
                    currentIngredient+=3;
                    ingredientsStack.push(currentIngredient);
                    break;
            }
        }


        if (haveAtLeastOneFromEach(foods)){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }else{
            System.out.println("Ugh, what a pity! You d idn't have enough materials to to cook everything.");
        }

        if (liquidsDeque.isEmpty()){
            System.out.println("Liquids left: none");
        }else{
            System.out.printf("Liquids left: ");
            System.out.println(liquidsDeque.toString().replace("[","").replace("]",""));
        }

        if (ingredientsStack.isEmpty()){
            System.out.println("Ingredients left: none");
        }else{
            System.out.printf("Ingredients left: ");
            System.out.println(ingredientsStack.toString().replace("[","").replace("]",""));
        }

        foods.entrySet().stream()
                .forEach(e-> System.out.printf("%s: %d%n",e.getKey(),e.getValue()));


    }

    private static boolean haveAtLeastOneFromEach(Map<String, Integer> foods) {
        for (Map.Entry<String, Integer> e : foods.entrySet()) {
            if (e.getValue()==0){
                return false;
            }
        }
        return true;
    }
}
