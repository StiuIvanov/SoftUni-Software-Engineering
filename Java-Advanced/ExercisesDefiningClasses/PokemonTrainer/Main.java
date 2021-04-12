package PokemonTrainer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers = new HashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("Tournament")) {
            String[] tokens = command.split("\\s+");

            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Trainer trainer = null;
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainers.putIfAbsent(trainerName, new Trainer(trainerName));
            trainers.get(trainerName).getPokemonsList().add(pokemon);

            command = scanner.nextLine();
        }


        String element = scanner.nextLine();
        while (!element.equals("End")) {
            String finalElement = element;

            trainers.entrySet().stream()
                    .forEach(e-> e.getValue().checkElement(finalElement));

            element = scanner.nextLine();
        }


        trainers.entrySet().stream()
                .sorted((t1,t2)-> t2.getValue().getNumberOfBadges()-t1.getValue().getNumberOfBadges())
                .forEach(str-> System.out.println(str.getValue()));

    }
}
