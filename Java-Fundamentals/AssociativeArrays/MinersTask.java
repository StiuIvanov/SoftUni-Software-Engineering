import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinersTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourceQuantity = new LinkedHashMap<>();

        String commandStop = scanner.nextLine();
        while (!commandStop.equals("stop")){
            String resource = commandStop;
            int quantityToAdd = Integer.parseInt(scanner.nextLine());

            Integer inputQuantity =  resourceQuantity.get(resource);
            if (inputQuantity==null){
                inputQuantity=0;
            }
            quantityToAdd+=inputQuantity;
                    resourceQuantity.put(resource, quantityToAdd);

            commandStop =scanner.nextLine();
        }

        resourceQuantity.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
