package bakery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Bakery {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        if (employees.size() < capacity) {
            employees.add(employee);
        }
    }

    public boolean remove(String name) {
        return employees.removeIf(e -> e.getName().equals(name));
    }

    public Employee getOldestEmployee() {
        Employee maxEmployee = employees.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .get();
        return maxEmployee;
    }

    public Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder(String.format("Employees working at Bakery %s:", this.name));
        for (Employee employee : employees) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(employee);
        }
        return stringBuilder.toString();
    }

}
