package PokemonTrainer2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String line = "";
        while (!(line = scanner.nextLine()).equals("Tournament")) {
            String[] tokens = line.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);
            Trainer trainer = new Trainer(trainerName);

            trainers.putIfAbsent(trainerName, trainer);
            trainers.get(trainerName).getPokemonList().add(pokemon);
        }

        while (!(line= scanner.nextLine()).equals("End")){
            String elementBattlefield = line;

            for (Trainer trainer : trainers.values()) {
                if (trainer.havePokemon(elementBattlefield)){
                    trainer.receiveBadge();
                } else{
                    trainer.reduceHealthPokemons();
                }
            }
        }

        trainers.values().stream()
                .sorted((t1,t2)-> Integer.compare(t2.getBadges(),t1.getBadges()))
                .forEach(System.out::println);



    }
}
