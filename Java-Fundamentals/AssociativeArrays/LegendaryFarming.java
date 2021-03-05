import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shards = 0;
        int fragments = 0;
        int motes = 0;
        Map<String, Integer> materialsAndJunk = new TreeMap<>();
        boolean obtained = false;
        while (!obtained) {
            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length; i = i + 2) {
                String currentMaterial = input[i+1].toLowerCase();
                int currentQuantityToAdd = Integer.parseInt(input[i]);

                switch (currentMaterial) {
                    case "shards":
                        shards += currentQuantityToAdd;
                        break;
                    case "fragments":
                        fragments += currentQuantityToAdd;
                        break;
                    case "motes":
                        motes += currentQuantityToAdd;
                        break;
                    default:

                        Integer materialQuantity = materialsAndJunk.get(currentMaterial);
                        if (materialQuantity == null) {
                            materialQuantity = 0;
                        }

                        currentQuantityToAdd += materialQuantity;
                        materialsAndJunk.put(currentMaterial, currentQuantityToAdd);
                }
                if (shards>=250 || fragments>=250 || motes>=250){
                    obtained=true;
                    break;
                }
            }
        }

        if (shards >= 250) {
            System.out.println("Shadowmourne obtained!");
            shards -= 250;
        } else if (fragments >= 250) {
            System.out.println("Valanyr obtained!");
            fragments -= 250;
        } else if (motes >= 250) {
            System.out.println("Dragonwrath obtained!");
            motes -= 250;
        }

        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", shards);
        keyMaterials.put("fragments", fragments);
        keyMaterials.put("motes", motes);
        keyMaterials.entrySet().stream().sorted((f,s) ->{
            int result = s.getValue().compareTo(f.getValue());
            if (result == 0 ){
                result= f.getKey().compareTo(s.getKey());
            }
            return result;
        } ).forEach(e -> System.out.println(e.getKey() + ": "+ e.getValue()));


        materialsAndJunk.forEach((k,v) -> {
            System.out.println(k + ": " + v);
        });
    }

}

