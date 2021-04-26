package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String line = "";
        while (!(line = scanner.nextLine()).equals("END")) {
            String[] personInfo = line.split("\\s+");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
            String town = personInfo[2];
            Person person = new Person(name, age, town);

            people.add(person);
        }

        int index = Integer.parseInt(scanner.nextLine());

        int equalPeople = 0;

        Person searchPerson = people.get(index - 1);
        for (Person person : people) {
            if (person.compareTo(searchPerson) == 0) {
                equalPeople++;
            }
        }

        if (equalPeople==1){
            System.out.println("No matches");
        }else{
            int allPeople = people.size();
            int difference = allPeople-equalPeople;
            System.out.printf("%d %d %d",
                    equalPeople,
                    difference,
                    allPeople);
        }



    }
}
