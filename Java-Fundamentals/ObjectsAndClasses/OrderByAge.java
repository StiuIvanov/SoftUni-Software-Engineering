import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Person{
        String name;
        String id;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String personInfo(){
            return String.format("%s with ID: %s is %d years old.", getName(), getId(), getAge());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!command.equals("End")) {
        String[] tokens = command.split(" ");
        String name = tokens[0];
        String id = tokens[1];
        int age = Integer.parseInt(tokens[2]);
            Person person = new Person(name,id, age);
            people.add(person);
            command =scanner.nextLine();
        }

        people.stream().sorted((age1, age2) -> Integer.compare(age1.getAge(),age2.getAge()))
                .forEach(person -> System.out.println(person.personInfo()));

    }
}
