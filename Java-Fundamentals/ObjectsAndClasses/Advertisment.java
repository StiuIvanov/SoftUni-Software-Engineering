import java.util.*;

public class Advertisment {
    static class FakeMessage{
        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.","Exceptional product.","I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        Random dice = new Random();

        public String generateFakeMessage(){
            return String.format("%s %s %s - %s", phrases.get(dice.nextInt(phrases.size())), events.get(dice.nextInt(events.size())),
                    authors.get(dice.nextInt(authors.size())), cities.get(dice.nextInt(cities.size())));
        }

        @Override
        public String toString() {
            return String.format("%s %s %s - %s", phrases.get(dice.nextInt(phrases.size())), events.get(dice.nextInt(events.size())),
                    authors.get(dice.nextInt(authors.size())), cities.get(dice.nextInt(cities.size())));
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Random dice = new Random();
        int n =Integer.parseInt(scanner.nextLine());
        FakeMessage fake = new FakeMessage();


        for (int i = 0; i <n ; i++) {
            System.out.println(fake);
        }
        System.out.println(fake.generateFakeMessage());



    }
}
