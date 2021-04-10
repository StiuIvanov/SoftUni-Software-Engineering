package CompanyRoster;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Department> departments = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String name = tokens[0];
            double salary  =Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            Employee employee=null;
            if (tokens.length==5){
                if (Character.isDigit(tokens[4].charAt(0))){
                    int age = Integer.parseInt(tokens[4]);
                    employee= new Employee(name,salary,position,department,age);
                }else{
                    String email = tokens[4];
                    employee= new Employee(name,salary,position,department,email);
                }

            } else if (tokens.length==6){
              int  age = Integer.parseInt(tokens[5]);
                String email= tokens[4];
                employee= new Employee(name,salary,position,department,email,age);
            } else if (tokens.length==4){
                employee=new Employee(name,salary,position,department);
            }

            departments.putIfAbsent(department, new Department(department));
            departments.get(department).getEmployeeList().add(employee);
        }

        Department highestAverageSalaray = departments.entrySet().stream()
                .max(Comparator.comparingDouble(o -> o.getValue().averageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + highestAverageSalaray.getName());

        highestAverageSalaray.getEmployeeList().stream()
                .sorted((o1, o2) -> Double.compare(o2.getSalary(),o1.getSalary()))
                .forEach(System.out::println);
    }
}
