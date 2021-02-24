import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    static class Person {
        String name;
        int age;

        @Override
        public String toString() {
            return String.format("%s - %d", name, age);
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> listPersons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Person current = new Person(input[0], Integer.parseInt(input[1]));
            listPersons.add(current);
        }

        listPersons.stream().filter(person -> person.age > 30).sorted((p1,p2) -> p1.name.compareTo(p2.name))
                .forEach(person -> System.out.println(person));

    }
}
