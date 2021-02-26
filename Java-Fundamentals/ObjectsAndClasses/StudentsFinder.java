import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsFinder {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String hometown;
        Student(String firstName,String lastName,String age, String hometown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public static Student parseStudent(String string) {
            String[] currentStudentText = string.split("\\s+");
            return new Student(currentStudentText[0],currentStudentText[1],
                    currentStudentText[2], currentStudentText[3]);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %s years old",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!command.equals("end")) {
            Student currentStudent = Student.parseStudent(command);
            int existingIndex =findStudentIndex(students, currentStudent.getFirstName(), currentStudent.getLastName());
            if (existingIndex!=-1){
                students.get(existingIndex).setHometown(currentStudent.getHometown());
                students.get(existingIndex).setAge(currentStudent.getAge());
            } else {
                students.add(currentStudent);
            }

            command = scanner.nextLine();
        }
        String town = scanner.nextLine();
        for (Student s : students) {
            if (town.equals(s.getHometown())) {
                System.out.println(s);
            }

        }

    }

    static int findStudentIndex(List<Student> students, String firstName, String lastName){
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i).getFirstName().equals(firstName)&&
                    students.get(i).getLastName().equals(lastName)){
                return i;
            }
        }
        return  -1;
    }
}
