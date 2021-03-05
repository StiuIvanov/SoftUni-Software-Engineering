import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Courses {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> coursesMAP = new LinkedHashMap<>();

        String commandEnd = scanner.nextLine();
        while (!commandEnd.equals("end")){
                String[] tokens = commandEnd.split(" : ");
                String courseName = tokens[0];
                String studentName = tokens[1];

                if (coursesMAP.containsKey(courseName)){
                    coursesMAP.get(courseName).add(studentName);
                }else{
                    coursesMAP.put(courseName, new ArrayList<>(Arrays.asList(studentName)));
                }

            commandEnd = scanner.nextLine();
        }

        coursesMAP.entrySet()
                .stream()
                .sorted((f,s) -> s.getValue().size()-f.getValue().size())
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue()
                            .stream()
                            .sorted((f,s) -> f.compareTo(s))
                            .forEach(st -> System.out.println("-- " + st));
                });
    }
}
