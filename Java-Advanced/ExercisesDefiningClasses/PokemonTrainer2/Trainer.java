package PokemonTrainer2;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemonList = new ArrayList<>();
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public boolean havePokemon(String elementBattlefield) {
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getElement().equals(elementBattlefield)){
                return true;
            }
        }
        return false;
    }

    public int getBadges() {
        return badges;
    }

    public void receiveBadge() {
        badges++;
    }

    public void reduceHealthPokemons() {
        for (Pokemon pokemon : pokemonList) {
            pokemon.reduceHealth();
//            if (pokemon.getHealth()<=0){
//                pokemonList.remove(pokemon);
//            }
        }
        checkForDeadPokemons();
    }



    private void checkForDeadPokemons() {
        for (int i = 0; i < pokemonList.size(); i++) {
            if (pokemonList.get(i).getHealth()<=0){
                pokemonList.remove(pokemonList.get(i));
                i--;
            }

        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",name,badges,pokemonList.size());
    }
}
