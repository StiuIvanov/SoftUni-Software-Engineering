package OpinionPoll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name,age);
            list.add(person);
        }

        list.stream()
                .sorted((o1,o2)-> o1.getName().compareTo(o2.getName()))
                .filter(p-> p.getAge()>30)
                .forEach(System.out::println);

    }
}
