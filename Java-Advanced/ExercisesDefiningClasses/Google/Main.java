package Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new HashMap<>();

        String line;
        while (!(line = scanner.nextLine()).equals("End")) {
            String[] tokens = line.split("\\s+");

            String name = tokens[0];
            people.putIfAbsent(name,new Person(name));

            switch (tokens[1]){
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);

                    people.get(name).setCompany(new Company(companyName,department,salary));
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];

                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    people.get(name).getPokemonList().add(pokemon);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];

                    Parent parent = new Parent(parentName,parentBirthday);
                    people.get(name).getParentList().add(parent);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];

                    Child child= new Child(childName,childBirthday);
                    people.get(name).getChildrenList().add(child);
                    break;
                case "car":
                    String carModel = tokens[2];
                    int carSpeed =Integer.parseInt(tokens[3]);

                    people.get(name).setCar(new Car(carModel,carSpeed));
                    break;
            }

        }

        String nameToOutput = scanner.nextLine();
        System.out.println(people.get(nameToOutput));

    }
}
