package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges = 0;
    private List<Pokemon> pokemonsList;


    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, numberOfBadges, pokemonsList.size());
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public List<Pokemon> getPokemonsList() {
        return pokemonsList;
    }

    public Trainer(String name) {
        this.name = name;
        pokemonsList = new ArrayList<>();
    }

    public void checkElement(String element) {
        if (pokemonsList.size()>0){
            boolean havePokemon = false;
            for (Pokemon pokemon : pokemonsList) {
                if (pokemon.getElement().equals(element)){
                    havePokemon=true;
                }
            }
            if (havePokemon) {
                containsElement();
            } else {
                doesntContainElement();
            }
        }
    }

    private void doesntContainElement() {

        for (int i = 0; i < pokemonsList.size(); i++) {
            pokemonsList.get(i).setHealth(pokemonsList.get(i).getHealth()-10);
            if (pokemonsList.get(i).getHealth()<=0){
                pokemonsList.remove(i);
                i--;
            }
        }

        }

        private void containsElement() {
            numberOfBadges++;
        }

    }

