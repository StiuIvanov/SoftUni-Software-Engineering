import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> studentsMAP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMAP.containsKey(name)){
                studentsMAP.put(name, grade);
            }else{
                double newGrade = (grade+studentsMAP.get(name)) / 2;
                studentsMAP.put(name, newGrade);
            }
        }

        studentsMAP.entrySet()
                .stream()
                .filter(e-> e.getValue()>=4.50)
                .sorted((g1,g2) -> g2.getValue().compareTo(g1.getValue()))
                .forEach(s -> System.out.println(String.format("%s -> %.2f",s.getKey(), s.getValue())));
    }
}
